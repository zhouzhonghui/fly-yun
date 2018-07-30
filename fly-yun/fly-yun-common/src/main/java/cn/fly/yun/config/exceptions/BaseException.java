/*
 *  Copyright [Apsaras Developer Integration System And Collaboration SoftWare] (c) 2099-2099.
 *
 *  Flying elastic computing system
 *
 *  IMPORTANT:THIS SOFTWARE END USER LICENSE AGREEMENT ("EULA") IS A LEGAL AGREEMENT BETWEEN YOU
 *  (EITHER AN INDIVIDUAL OR, IF PURCHASED OR OTHERWISE ACQUIRED BY OR FOR AN ENTITY, A SINGLE
 *  LEGAL ENTITY) AND Apsaras-hsf. READ IT CAREFULLY BEFORE COMPLETING THE INSTALLATION PROCESS AND
 *  USING THIS SOFTWARE. IT PROVIDES A LICENSE TO USE THIS SOFTWARE AND CONTAINS WARRANTY
 *  INFORMATION AND LIABILITY DISCLAIMERS. BY DOWNLOADING OR INSTALLING THE SOFTWARE YOU ARE
 *  INDICATING YOUR ASSENT TO THE TERMS OF THIS LICENSE. IF YOU DO NOT AGREE TO ALL OF THE
 *  FOLLOWING TERMS, DO NOT DOWNLOAD OR INSTALL THE SOFTWARE OR DISCONTINUE USE IMMEDIATELY AND
 *   DESTROY ALL COPIES IN YOUR POSSESSION. YOU ALSO ACCEPT AND ASSENT TO THE CELL hsf PRIVACY
 *  POLICY LOCATED AT http://www.apsarasSoft.com/privacy_policy.html AND YOU AGREE TO RECEIVE NOTICES
 *  FROM Apsaras hsf ELECTRONICALLY.
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License
 *  is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied. See the License for the specific language governing permissions and limitations under the License.
 */

package cn.fly.yun.config.exceptions;

/**
 * 异常基类，各个模块的运行期异常均继承与该类
 */
public class BaseException extends RuntimeException {

    /**
     * the serialVersionUID
     */
    private static final long serialVersionUID = 1381325479896057076L;

    /**
     * message key
     */
    private String code;

    /**
     * message params
     */
    private Object[] values;

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the values
     */
    public Object[] getValues() {
        return values;
    }

    /**
     * @param values the values to set
     */
    public void setValues(Object... values) {
        this.values = values;
    }

    public BaseException(String message, Throwable cause, String code, Object... values) {
        super(message, cause);
        this.code = code;
        this.values = values;
    }
}
