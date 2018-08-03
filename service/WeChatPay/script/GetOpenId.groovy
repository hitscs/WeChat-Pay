
import java.util.Map
import org.moqui.context.ExecutionContext
// org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger("findParty")

def getOpenIdUrl="https://api.weixin.qq.com/sns/jscode2session"
def appid=appid
def secret=secret
def js_code=code
def grant_type="authorization_code"
ExecutionContext ec = context.ec


//String url=getOpenIdUrl+"?appid="+appid+"&secret="+secret+"&js_code="+js_code+"&grant_type="+grant_type
//
//org.moqui.util.RestClient.RestResponse openIdResponse = ec.service.rest().method("GET").uri(url).call()
//if (openIdResponse.statusCode == 200) {
//
//	Map respMap = (Map) openIdResponse.jsonObject()
//
//
//} else {
//	ec.message.addMessage("Error ")
//}


Map respMap = ['openid':'Bruce', 'session_key':27] 
openid=respMap.openid
session_key=respMap.session_key