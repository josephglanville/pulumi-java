// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVirtualNetworkGatewayVpnclientIpsecParametersResult {
    /**
     * The DH Group used in IKE Phase 1 for initial SA.
     * 
     */
    private final String dhGroup;
    /**
     * The IKE encryption algorithm (IKE phase 2).
     * 
     */
    private final String ikeEncryption;
    /**
     * The IKE integrity algorithm (IKE phase 2).
     * 
     */
    private final String ikeIntegrity;
    /**
     * The IPSec encryption algorithm (IKE phase 1).
     * 
     */
    private final String ipsecEncryption;
    /**
     * The IPSec integrity algorithm (IKE phase 1).
     * 
     */
    private final String ipsecIntegrity;
    /**
     * The Pfs Group used in IKE Phase 2 for new child SA.
     * 
     */
    private final String pfsGroup;
    /**
     * The IPSec Security Association (also called Quick Mode or Phase 2 SA) payload size in KB for P2S client..
     * 
     */
    private final Integer saDataSizeKilobytes;
    /**
     * The IPSec Security Association (also called Quick Mode or Phase 2 SA) lifetime in seconds for P2S client.
     * 
     */
    private final Integer saLifeTimeSeconds;

    @CustomType.Constructor
    private GetVirtualNetworkGatewayVpnclientIpsecParametersResult(
        @CustomType.Parameter("dhGroup") String dhGroup,
        @CustomType.Parameter("ikeEncryption") String ikeEncryption,
        @CustomType.Parameter("ikeIntegrity") String ikeIntegrity,
        @CustomType.Parameter("ipsecEncryption") String ipsecEncryption,
        @CustomType.Parameter("ipsecIntegrity") String ipsecIntegrity,
        @CustomType.Parameter("pfsGroup") String pfsGroup,
        @CustomType.Parameter("saDataSizeKilobytes") Integer saDataSizeKilobytes,
        @CustomType.Parameter("saLifeTimeSeconds") Integer saLifeTimeSeconds) {
        this.dhGroup = dhGroup;
        this.ikeEncryption = ikeEncryption;
        this.ikeIntegrity = ikeIntegrity;
        this.ipsecEncryption = ipsecEncryption;
        this.ipsecIntegrity = ipsecIntegrity;
        this.pfsGroup = pfsGroup;
        this.saDataSizeKilobytes = saDataSizeKilobytes;
        this.saLifeTimeSeconds = saLifeTimeSeconds;
    }

    /**
     * The DH Group used in IKE Phase 1 for initial SA.
     * 
    */
    public String getDhGroup() {
        return this.dhGroup;
    }
    /**
     * The IKE encryption algorithm (IKE phase 2).
     * 
    */
    public String getIkeEncryption() {
        return this.ikeEncryption;
    }
    /**
     * The IKE integrity algorithm (IKE phase 2).
     * 
    */
    public String getIkeIntegrity() {
        return this.ikeIntegrity;
    }
    /**
     * The IPSec encryption algorithm (IKE phase 1).
     * 
    */
    public String getIpsecEncryption() {
        return this.ipsecEncryption;
    }
    /**
     * The IPSec integrity algorithm (IKE phase 1).
     * 
    */
    public String getIpsecIntegrity() {
        return this.ipsecIntegrity;
    }
    /**
     * The Pfs Group used in IKE Phase 2 for new child SA.
     * 
    */
    public String getPfsGroup() {
        return this.pfsGroup;
    }
    /**
     * The IPSec Security Association (also called Quick Mode or Phase 2 SA) payload size in KB for P2S client..
     * 
    */
    public Integer getSaDataSizeKilobytes() {
        return this.saDataSizeKilobytes;
    }
    /**
     * The IPSec Security Association (also called Quick Mode or Phase 2 SA) lifetime in seconds for P2S client.
     * 
    */
    public Integer getSaLifeTimeSeconds() {
        return this.saLifeTimeSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkGatewayVpnclientIpsecParametersResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dhGroup;
        private String ikeEncryption;
        private String ikeIntegrity;
        private String ipsecEncryption;
        private String ipsecIntegrity;
        private String pfsGroup;
        private Integer saDataSizeKilobytes;
        private Integer saLifeTimeSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkGatewayVpnclientIpsecParametersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dhGroup = defaults.dhGroup;
    	      this.ikeEncryption = defaults.ikeEncryption;
    	      this.ikeIntegrity = defaults.ikeIntegrity;
    	      this.ipsecEncryption = defaults.ipsecEncryption;
    	      this.ipsecIntegrity = defaults.ipsecIntegrity;
    	      this.pfsGroup = defaults.pfsGroup;
    	      this.saDataSizeKilobytes = defaults.saDataSizeKilobytes;
    	      this.saLifeTimeSeconds = defaults.saLifeTimeSeconds;
        }

        public Builder dhGroup(String dhGroup) {
            this.dhGroup = Objects.requireNonNull(dhGroup);
            return this;
        }
        public Builder ikeEncryption(String ikeEncryption) {
            this.ikeEncryption = Objects.requireNonNull(ikeEncryption);
            return this;
        }
        public Builder ikeIntegrity(String ikeIntegrity) {
            this.ikeIntegrity = Objects.requireNonNull(ikeIntegrity);
            return this;
        }
        public Builder ipsecEncryption(String ipsecEncryption) {
            this.ipsecEncryption = Objects.requireNonNull(ipsecEncryption);
            return this;
        }
        public Builder ipsecIntegrity(String ipsecIntegrity) {
            this.ipsecIntegrity = Objects.requireNonNull(ipsecIntegrity);
            return this;
        }
        public Builder pfsGroup(String pfsGroup) {
            this.pfsGroup = Objects.requireNonNull(pfsGroup);
            return this;
        }
        public Builder saDataSizeKilobytes(Integer saDataSizeKilobytes) {
            this.saDataSizeKilobytes = Objects.requireNonNull(saDataSizeKilobytes);
            return this;
        }
        public Builder saLifeTimeSeconds(Integer saLifeTimeSeconds) {
            this.saLifeTimeSeconds = Objects.requireNonNull(saLifeTimeSeconds);
            return this;
        }        public GetVirtualNetworkGatewayVpnclientIpsecParametersResult build() {
            return new GetVirtualNetworkGatewayVpnclientIpsecParametersResult(dhGroup, ikeEncryption, ikeIntegrity, ipsecEncryption, ipsecIntegrity, pfsGroup, saDataSizeKilobytes, saLifeTimeSeconds);
        }
    }
}
