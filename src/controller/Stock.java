package controller;

import java.util.ArrayList;

import model.Article;

public class Stock {

	ArrayList<Article> articles;

	public Stock(ArrayList<Article> articles) {
		super();
		this.articles = articles;
	}
	
	public void addArticle(Article a){
		
		this.articles.add(a);
		
	}
	
}
