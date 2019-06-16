package com.hackaton.compgenblockdocs.service;

import com.hackaton.compgenblockdocs.model.BlockModel;
import com.hackaton.compgenblockdocs.repository.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//import com.google.gson.GsonBuilder;

@Service
public class BlockchainModel {

    @Autowired
    private BlockRepository repository;

    public static ArrayList<BlockModel> blockchain = new ArrayList<BlockModel>();
    public static int difficulty = 4;

    public ArrayList<BlockModel> start(String data) {
        //add our blocks to the blockchain ArrayList:

        System.out.println("Trying to Mine block 1... ");
        addBlock(new BlockModel(data, "0"),data);

        System.out.println("\nBlockchain is Valid: " + isChainValid());

//        String blockchainJson = StringUtil.getJson(blockchain);
        System.out.println("\nThe block chain: ");
//        System.out.println(blockchainJson);

        return blockchain;
    }


    public List<BlockModel> listBlock(){
       return repository.findAll();
    }

    public List<BlockModel> listByParam(String value){
        List<BlockModel> list = repository.findAll();
        List<BlockModel> response = new ArrayList<BlockModel>();
        list.forEach( l ->{
            if(l.getData().equals(value)){
                response.add(l);
            }
        });

        return response;
    }

    public static Boolean isChainValid() {
        BlockModel currentBlock;
        BlockModel previousBlock;
        String hashTarget = new String(new char[difficulty]).replace('\0', '0');

        //loop through blockchain to check hashes:
        for(int i=1; i < blockchain.size(); i++) {
            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i-1);
            //compare registered hash and calculated hash:
            if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
                System.out.println("Current Hashes not equal");
                return false;
            }
            //compare previous hash and registered previous hash
            if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
                System.out.println("Previous Hashes not equal");
                return false;
            }
            //check if hash is solved
            if(!currentBlock.hash.substring( 0, difficulty).equals(hashTarget)) {
                System.out.println("This block hasn't been mined");
                return false;
            }

        }
        return true;
    }

    public void addBlock(BlockModel newBlock,String data) {
        newBlock.mineBlock(difficulty);
        List<BlockModel> block =  repository.findAll();


        if(block.size() > 0){
            newBlock.setLastBlock(block.get(block.size()-1).getHash());
        }else{
//            newBlock.setLastBlock(block.get(0).getHash());
        }

        newBlock.setData(data);
        difficulty++;
        repository.save(newBlock);

    }

    public BlockModel getLastBlock(BlockModel newBlock) {
        System.out.println(newBlock.getLastBlock());
//        System.out.println(this.blockchain.get(1).);
        List<BlockModel> block =  repository.findAll();
                System.out.println(block.size());
        System.out.println(newBlock.getLastBlock().equals("0"));



        if(newBlock.getLastBlock().equals("0")){
            return block.get(block.size());
        }else{
            return block.get(block.size() - 1);
        }



//        return this.blockchain.get(this.blockchain.size());

    }
}