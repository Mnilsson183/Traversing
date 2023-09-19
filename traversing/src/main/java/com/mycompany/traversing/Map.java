/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.traversing;

/**
 *
 * @author morgan
 */
public class Map {
    
    Node head;
    
    static class Node{
        static String name;
        static String[] pathNames;
        static Node[] paths;
        static double[] times;
        
        public Node(String constructName, String[] constructPathNames, Node[] constructPaths, double[] constructTimes){
            name = constructName;
            pathNames = constructPathNames;
            paths = constructPaths;
            times = constructTimes;
    }
    
    public static Map makeMap(Map locations, String[] names, String[][] pathNames, Node[][] paths, double[][] times){
        for(int node = 0; node < names.length; node++){
            String name = names[node];
            
            String[] pathName;
            System.arraycopy(pathNames[node], 0, pathName, 0, names.length);
            
            node[] paths;
            System.arraycopy(pathNames[node], 0, pathName, 0, names.length);
        }
            insert(locations, names[i], pathNames[i][], pathNames[i][], paths[i][], times[i][]);
        }
    }
    
    public static Map insert(Map locations, String name, String[] pathNames, Node[] paths, double[] times){
        Node new_node = new Node(name, pathNames, paths, times);
    }
}
