package model;

import java.io.BufferedReader;
import java.util.Map;

public class HttpTemplate {
  protected Map<String, String> startLine;
  protected Map<String, String> header;
  protected String body;
  protected BufferedReader br;
}