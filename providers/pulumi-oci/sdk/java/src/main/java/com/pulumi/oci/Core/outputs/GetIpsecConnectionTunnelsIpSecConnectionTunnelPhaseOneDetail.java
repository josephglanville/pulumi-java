// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIpsecConnectionTunnelsIpSecConnectionTunnelPhaseOneDetail {
    /**
     * @return Phase two authentication algorithm proposed during tunnel negotiation.
     * 
     */
    private final String customAuthenticationAlgorithm;
    /**
     * @return The proposed custom Diffie-Hellman group.
     * 
     */
    private final String customDhGroup;
    /**
     * @return The proposed custom phase two encryption algorithm.
     * 
     */
    private final String customEncryptionAlgorithm;
    /**
     * @return Indicates whether custom phase one configuration is enabled. If this option is not enabled, default settings are proposed.
     * 
     */
    private final Boolean isCustomPhaseOneConfig;
    /**
     * @return Indicates whether IKE phase one is established.
     * 
     */
    private final Boolean isIkeEstablished;
    /**
     * @return The total configured lifetime of the IKE security association.
     * 
     */
    private final String lifetime;
    /**
     * @return The negotiated phase two authentication algorithm.
     * 
     */
    private final String negotiatedAuthenticationAlgorithm;
    /**
     * @return The negotiated Diffie-Hellman group.
     * 
     */
    private final String negotiatedDhGroup;
    /**
     * @return The negotiated encryption algorithm.
     * 
     */
    private final String negotiatedEncryptionAlgorithm;
    /**
     * @return The remaining lifetime before the key is refreshed.
     * 
     */
    private final String remainingLifetime;
    /**
     * @return The date and time the remaining lifetime was last retrieved, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    private final String remainingLifetimeLastRetrieved;

    @CustomType.Constructor
    private GetIpsecConnectionTunnelsIpSecConnectionTunnelPhaseOneDetail(
        @CustomType.Parameter("customAuthenticationAlgorithm") String customAuthenticationAlgorithm,
        @CustomType.Parameter("customDhGroup") String customDhGroup,
        @CustomType.Parameter("customEncryptionAlgorithm") String customEncryptionAlgorithm,
        @CustomType.Parameter("isCustomPhaseOneConfig") Boolean isCustomPhaseOneConfig,
        @CustomType.Parameter("isIkeEstablished") Boolean isIkeEstablished,
        @CustomType.Parameter("lifetime") String lifetime,
        @CustomType.Parameter("negotiatedAuthenticationAlgorithm") String negotiatedAuthenticationAlgorithm,
        @CustomType.Parameter("negotiatedDhGroup") String negotiatedDhGroup,
        @CustomType.Parameter("negotiatedEncryptionAlgorithm") String negotiatedEncryptionAlgorithm,
        @CustomType.Parameter("remainingLifetime") String remainingLifetime,
        @CustomType.Parameter("remainingLifetimeLastRetrieved") String remainingLifetimeLastRetrieved) {
        this.customAuthenticationAlgorithm = customAuthenticationAlgorithm;
        this.customDhGroup = customDhGroup;
        this.customEncryptionAlgorithm = customEncryptionAlgorithm;
        this.isCustomPhaseOneConfig = isCustomPhaseOneConfig;
        this.isIkeEstablished = isIkeEstablished;
        this.lifetime = lifetime;
        this.negotiatedAuthenticationAlgorithm = negotiatedAuthenticationAlgorithm;
        this.negotiatedDhGroup = negotiatedDhGroup;
        this.negotiatedEncryptionAlgorithm = negotiatedEncryptionAlgorithm;
        this.remainingLifetime = remainingLifetime;
        this.remainingLifetimeLastRetrieved = remainingLifetimeLastRetrieved;
    }

    /**
     * @return Phase two authentication algorithm proposed during tunnel negotiation.
     * 
     */
    public String customAuthenticationAlgorithm() {
        return this.customAuthenticationAlgorithm;
    }
    /**
     * @return The proposed custom Diffie-Hellman group.
     * 
     */
    public String customDhGroup() {
        return this.customDhGroup;
    }
    /**
     * @return The proposed custom phase two encryption algorithm.
     * 
     */
    public String customEncryptionAlgorithm() {
        return this.customEncryptionAlgorithm;
    }
    /**
     * @return Indicates whether custom phase one configuration is enabled. If this option is not enabled, default settings are proposed.
     * 
     */
    public Boolean isCustomPhaseOneConfig() {
        return this.isCustomPhaseOneConfig;
    }
    /**
     * @return Indicates whether IKE phase one is established.
     * 
     */
    public Boolean isIkeEstablished() {
        return this.isIkeEstablished;
    }
    /**
     * @return The total configured lifetime of the IKE security association.
     * 
     */
    public String lifetime() {
        return this.lifetime;
    }
    /**
     * @return The negotiated phase two authentication algorithm.
     * 
     */
    public String negotiatedAuthenticationAlgorithm() {
        return this.negotiatedAuthenticationAlgorithm;
    }
    /**
     * @return The negotiated Diffie-Hellman group.
     * 
     */
    public String negotiatedDhGroup() {
        return this.negotiatedDhGroup;
    }
    /**
     * @return The negotiated encryption algorithm.
     * 
     */
    public String negotiatedEncryptionAlgorithm() {
        return this.negotiatedEncryptionAlgorithm;
    }
    /**
     * @return The remaining lifetime before the key is refreshed.
     * 
     */
    public String remainingLifetime() {
        return this.remainingLifetime;
    }
    /**
     * @return The date and time the remaining lifetime was last retrieved, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    public String remainingLifetimeLastRetrieved() {
        return this.remainingLifetimeLastRetrieved;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpsecConnectionTunnelsIpSecConnectionTunnelPhaseOneDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String customAuthenticationAlgorithm;
        private String customDhGroup;
        private String customEncryptionAlgorithm;
        private Boolean isCustomPhaseOneConfig;
        private Boolean isIkeEstablished;
        private String lifetime;
        private String negotiatedAuthenticationAlgorithm;
        private String negotiatedDhGroup;
        private String negotiatedEncryptionAlgorithm;
        private String remainingLifetime;
        private String remainingLifetimeLastRetrieved;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIpsecConnectionTunnelsIpSecConnectionTunnelPhaseOneDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customAuthenticationAlgorithm = defaults.customAuthenticationAlgorithm;
    	      this.customDhGroup = defaults.customDhGroup;
    	      this.customEncryptionAlgorithm = defaults.customEncryptionAlgorithm;
    	      this.isCustomPhaseOneConfig = defaults.isCustomPhaseOneConfig;
    	      this.isIkeEstablished = defaults.isIkeEstablished;
    	      this.lifetime = defaults.lifetime;
    	      this.negotiatedAuthenticationAlgorithm = defaults.negotiatedAuthenticationAlgorithm;
    	      this.negotiatedDhGroup = defaults.negotiatedDhGroup;
    	      this.negotiatedEncryptionAlgorithm = defaults.negotiatedEncryptionAlgorithm;
    	      this.remainingLifetime = defaults.remainingLifetime;
    	      this.remainingLifetimeLastRetrieved = defaults.remainingLifetimeLastRetrieved;
        }

        public Builder customAuthenticationAlgorithm(String customAuthenticationAlgorithm) {
            this.customAuthenticationAlgorithm = Objects.requireNonNull(customAuthenticationAlgorithm);
            return this;
        }
        public Builder customDhGroup(String customDhGroup) {
            this.customDhGroup = Objects.requireNonNull(customDhGroup);
            return this;
        }
        public Builder customEncryptionAlgorithm(String customEncryptionAlgorithm) {
            this.customEncryptionAlgorithm = Objects.requireNonNull(customEncryptionAlgorithm);
            return this;
        }
        public Builder isCustomPhaseOneConfig(Boolean isCustomPhaseOneConfig) {
            this.isCustomPhaseOneConfig = Objects.requireNonNull(isCustomPhaseOneConfig);
            return this;
        }
        public Builder isIkeEstablished(Boolean isIkeEstablished) {
            this.isIkeEstablished = Objects.requireNonNull(isIkeEstablished);
            return this;
        }
        public Builder lifetime(String lifetime) {
            this.lifetime = Objects.requireNonNull(lifetime);
            return this;
        }
        public Builder negotiatedAuthenticationAlgorithm(String negotiatedAuthenticationAlgorithm) {
            this.negotiatedAuthenticationAlgorithm = Objects.requireNonNull(negotiatedAuthenticationAlgorithm);
            return this;
        }
        public Builder negotiatedDhGroup(String negotiatedDhGroup) {
            this.negotiatedDhGroup = Objects.requireNonNull(negotiatedDhGroup);
            return this;
        }
        public Builder negotiatedEncryptionAlgorithm(String negotiatedEncryptionAlgorithm) {
            this.negotiatedEncryptionAlgorithm = Objects.requireNonNull(negotiatedEncryptionAlgorithm);
            return this;
        }
        public Builder remainingLifetime(String remainingLifetime) {
            this.remainingLifetime = Objects.requireNonNull(remainingLifetime);
            return this;
        }
        public Builder remainingLifetimeLastRetrieved(String remainingLifetimeLastRetrieved) {
            this.remainingLifetimeLastRetrieved = Objects.requireNonNull(remainingLifetimeLastRetrieved);
            return this;
        }        public GetIpsecConnectionTunnelsIpSecConnectionTunnelPhaseOneDetail build() {
            return new GetIpsecConnectionTunnelsIpSecConnectionTunnelPhaseOneDetail(customAuthenticationAlgorithm, customDhGroup, customEncryptionAlgorithm, isCustomPhaseOneConfig, isIkeEstablished, lifetime, negotiatedAuthenticationAlgorithm, negotiatedDhGroup, negotiatedEncryptionAlgorithm, remainingLifetime, remainingLifetimeLastRetrieved);
        }
    }
}
