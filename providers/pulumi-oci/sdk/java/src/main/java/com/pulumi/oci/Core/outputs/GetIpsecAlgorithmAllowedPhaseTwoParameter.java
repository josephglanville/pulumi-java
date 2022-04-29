// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIpsecAlgorithmAllowedPhaseTwoParameter {
    /**
     * @return Allowed phase two authentication algorithms.
     * 
     */
    private final List<String> authenticationAlgorithms;
    /**
     * @return Allowed phase two encryption algorithms.
     * 
     */
    private final List<String> encryptionAlgorithms;
    /**
     * @return Allowed perfect forward secrecy Diffie-Hellman groups.
     * 
     */
    private final List<String> pfsDhGroups;

    @CustomType.Constructor
    private GetIpsecAlgorithmAllowedPhaseTwoParameter(
        @CustomType.Parameter("authenticationAlgorithms") List<String> authenticationAlgorithms,
        @CustomType.Parameter("encryptionAlgorithms") List<String> encryptionAlgorithms,
        @CustomType.Parameter("pfsDhGroups") List<String> pfsDhGroups) {
        this.authenticationAlgorithms = authenticationAlgorithms;
        this.encryptionAlgorithms = encryptionAlgorithms;
        this.pfsDhGroups = pfsDhGroups;
    }

    /**
     * @return Allowed phase two authentication algorithms.
     * 
     */
    public List<String> authenticationAlgorithms() {
        return this.authenticationAlgorithms;
    }
    /**
     * @return Allowed phase two encryption algorithms.
     * 
     */
    public List<String> encryptionAlgorithms() {
        return this.encryptionAlgorithms;
    }
    /**
     * @return Allowed perfect forward secrecy Diffie-Hellman groups.
     * 
     */
    public List<String> pfsDhGroups() {
        return this.pfsDhGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpsecAlgorithmAllowedPhaseTwoParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> authenticationAlgorithms;
        private List<String> encryptionAlgorithms;
        private List<String> pfsDhGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIpsecAlgorithmAllowedPhaseTwoParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationAlgorithms = defaults.authenticationAlgorithms;
    	      this.encryptionAlgorithms = defaults.encryptionAlgorithms;
    	      this.pfsDhGroups = defaults.pfsDhGroups;
        }

        public Builder authenticationAlgorithms(List<String> authenticationAlgorithms) {
            this.authenticationAlgorithms = Objects.requireNonNull(authenticationAlgorithms);
            return this;
        }
        public Builder authenticationAlgorithms(String... authenticationAlgorithms) {
            return authenticationAlgorithms(List.of(authenticationAlgorithms));
        }
        public Builder encryptionAlgorithms(List<String> encryptionAlgorithms) {
            this.encryptionAlgorithms = Objects.requireNonNull(encryptionAlgorithms);
            return this;
        }
        public Builder encryptionAlgorithms(String... encryptionAlgorithms) {
            return encryptionAlgorithms(List.of(encryptionAlgorithms));
        }
        public Builder pfsDhGroups(List<String> pfsDhGroups) {
            this.pfsDhGroups = Objects.requireNonNull(pfsDhGroups);
            return this;
        }
        public Builder pfsDhGroups(String... pfsDhGroups) {
            return pfsDhGroups(List.of(pfsDhGroups));
        }        public GetIpsecAlgorithmAllowedPhaseTwoParameter build() {
            return new GetIpsecAlgorithmAllowedPhaseTwoParameter(authenticationAlgorithms, encryptionAlgorithms, pfsDhGroups);
        }
    }
}
