package com.github.alirezagolshan.crawler.util;

public class Constants {
  public static final String API = "/api";
  public static final String V1 = "/v1";
  public static final String CONFIGS = "/configs";
  public static final String AIRPORT_CODE_CONTROLLER = "Airport Code Controller";
  public static final String AIRPORT_CODE_CONTROLLER_DESCRIPTION = "the airport code API";
  public static final String AIRPORT_CODE = "/airport-code";
  public static final String AIRPORT_CODE_PATH = API + V1 + AIRPORT_CODE;
  public static final String AIRPORT_CODE_DELETE = "/{airport-id}";
  public static final String CRAWLER_CONTROLLER = "Crawler Controller";
  public static final String CRAWLER_CONTROLLER_DESCRIPTION = "the crawler API";
  public static final String FLIGHT = "/flight";
  public static final String FRESH = "/fresh";
  public static final String CRAWLER_FRESH_DATA_PATH = FRESH + FLIGHT;
  public static final String CRAWLER_FRESH_DATA_SUMMERY = "Get fresh flight data";
  public static final String CRAWLER_FRESH_DATA_DESCRIPTION = "Getting fresh flight data every time this API is called";
  public static final String CRAWLER_DATA_SUMMERY = "Get flight data";
  public static final String CRAWLER_DATA_DESCRIPTION = "Getting flight data from the database if it exists";
  public static final String SPIDERS = "/spiders";
  public static final String CRAWLER_PATH = API + V1 + SPIDERS;
  public static final String GENERAL_CONFIG_PATH = CRAWLER_PATH + CONFIGS;
  public static final String GENERAL_CONFIG_CONTROLLER = "General Config Controller";
  public static final String GENERAL_CONFIG_CONTROLLER_DESCRIPTION = "the general config API";
  public static final String SPIDER = "/spider";
  public static final String ROUTES = "/routes";
  public static final String ROUTE_CONFIG_CONTROLLER_PATH = API + V1 + SPIDER + ROUTES;
  public static final String ROUTE_CONFIG_CONTROLLER = "Route Config Controller";
  public static final String ROUTE_CONFIG_CONTROLLER_DESCRIPTION = "the route config API";
  public static final String ROUTE_CONFIG_DELETE = "/{route-id}";
  public static final String ROUTE_CONFIG_DELETE_PATH = FLIGHT + ROUTE_CONFIG_DELETE;
  public static final String OPEN_API_TITLE = "Crawler Application API";
  public static final String OPEN_API_DESCRIPTION = "Crawler Application API";
  public static final String APPLICATION_LOGGER = "Application Logger";
  public static final String CRAWLING_PERIOD = "CRAWLING_PERIOD";
  public static final String THIRTY = "30";
  public static final String SEEDER_MESSAGE = "Seeded successfully";
  public static final String SUPERUSER_USERNAME = "admin";
  public static final String SUPERUSER_PASSWORD = "admin_@12345"; //I know ;)
  public static final String SUPERUSER_ROLE = "ROLE_ADMIN";
  public static final String PUBLIC_PATH = "/public/**";
  public static final String USERNAME_NOT_FOUND = "username not found!";
  public static final String AUTHORIZATION = "Authorization";
  public static final String JWT_BEARER = "Bearer ";
  public static final String BEARER = "bearer";
  public static final String JWT_SECRET = "zSGQ43Uj46c4fEW8ZqZgiUfAcXmNKQ92ERY9A9Y64StR9EQoPPo9003hfrEEr1e";
  public static final String JWT = "JWT";
  public static final String SECURITY_SCHEME_NAME = "bearerAuth";
  public static final String AUTHORITIES = "authorities";
  public static final String INVALID_TOKEN_MESSAGE = "Token cannot be truest";
  public static final String CRAWLER_API = "Crawler API";
  public static final String BEARER_AUTHENTICATION = "Bearer Authentication";
  public static final String VERSION = "1.0";
}
