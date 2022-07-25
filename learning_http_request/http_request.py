import http.client						

conn = http.client.HTTPSConnection("catfact.ninja")		
body = ''							
headers = {							
  'Accept': 'application/json'
}
conn.request("GET", "/fact", body, headers)			
res = conn.getresponse()					
print(res.status)						
data = res.read()						
print(data.decode("utf-8"))	