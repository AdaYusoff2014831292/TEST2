import re, uuid
print "Mac Addr:" + ':'.join(re.findall('..', '%012x' % uuid.getnode()))
   
def get_ip_6(host, port=0):
    import socket
    
    result = socket.getaddrinfo(host, port, socket.AF_INET6)
    return result

