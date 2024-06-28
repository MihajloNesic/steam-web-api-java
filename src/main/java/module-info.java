module com.lukaspradel.steamapi {
	requires java.net.http;
	requires com.fasterxml.jackson.annotation;
	requires com.fasterxml.jackson.databind;

	exports com.lukaspradel.steamapi.core;
	exports com.lukaspradel.steamapi.core.exception;
	exports com.lukaspradel.steamapi.data.json.achievementpercentages;
	exports com.lukaspradel.steamapi.data.json.applist;
	exports com.lukaspradel.steamapi.data.json.appnews;
	exports com.lukaspradel.steamapi.data.json.dota2.fantasyplayerstats;
	exports com.lukaspradel.steamapi.data.json.dota2.gameitems;
	exports com.lukaspradel.steamapi.data.json.dota2.heroes;
	exports com.lukaspradel.steamapi.data.json.dota2.leaguelisting;
	exports com.lukaspradel.steamapi.data.json.dota2.liveleaguegames;
	exports com.lukaspradel.steamapi.data.json.dota2.matchdetails;
	exports com.lukaspradel.steamapi.data.json.dota2.matchhistory;
	exports com.lukaspradel.steamapi.data.json.dota2.matchhistorybysequencenum;
	exports com.lukaspradel.steamapi.data.json.dota2.playerofficialinfo;
	exports com.lukaspradel.steamapi.data.json.dota2.proplayerlist;
	exports com.lukaspradel.steamapi.data.json.dota2.teaminfobyteamid;
	exports com.lukaspradel.steamapi.data.json.friendslist;
	exports com.lukaspradel.steamapi.data.json.getglobalstatsforgame;
	exports com.lukaspradel.steamapi.data.json.getplayerbans;
	exports com.lukaspradel.steamapi.data.json.getschemaforgame;
	exports com.lukaspradel.steamapi.data.json.isplayingsharedgame;
	exports com.lukaspradel.steamapi.data.json.ownedgames;
	exports com.lukaspradel.steamapi.data.json.playerachievements;
	exports com.lukaspradel.steamapi.data.json.playerstats;
	exports com.lukaspradel.steamapi.data.json.playersummaries;
	exports com.lukaspradel.steamapi.data.json.recentlyplayedgames;
	exports com.lukaspradel.steamapi.data.json.resolvevanityurl;
	exports com.lukaspradel.steamapi.webapi.client;
	exports com.lukaspradel.steamapi.webapi.core;
	exports com.lukaspradel.steamapi.webapi.request;
	exports com.lukaspradel.steamapi.webapi.request.builders;
	exports com.lukaspradel.steamapi.webapi.request.dota2;
}
