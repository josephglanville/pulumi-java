// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Functions.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Functions.outputs.GetApplicationImagePolicyConfigKeyDetail;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplicationImagePolicyConfig {
    /**
     * @return Define if image signature verification policy is enabled for the application.
     * 
     */
    private final Boolean isPolicyEnabled;
    /**
     * @return A list of KMS key details.
     * 
     */
    private final List<GetApplicationImagePolicyConfigKeyDetail> keyDetails;

    @CustomType.Constructor
    private GetApplicationImagePolicyConfig(
        @CustomType.Parameter("isPolicyEnabled") Boolean isPolicyEnabled,
        @CustomType.Parameter("keyDetails") List<GetApplicationImagePolicyConfigKeyDetail> keyDetails) {
        this.isPolicyEnabled = isPolicyEnabled;
        this.keyDetails = keyDetails;
    }

    /**
     * @return Define if image signature verification policy is enabled for the application.
     * 
     */
    public Boolean isPolicyEnabled() {
        return this.isPolicyEnabled;
    }
    /**
     * @return A list of KMS key details.
     * 
     */
    public List<GetApplicationImagePolicyConfigKeyDetail> keyDetails() {
        return this.keyDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationImagePolicyConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isPolicyEnabled;
        private List<GetApplicationImagePolicyConfigKeyDetail> keyDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationImagePolicyConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isPolicyEnabled = defaults.isPolicyEnabled;
    	      this.keyDetails = defaults.keyDetails;
        }

        public Builder isPolicyEnabled(Boolean isPolicyEnabled) {
            this.isPolicyEnabled = Objects.requireNonNull(isPolicyEnabled);
            return this;
        }
        public Builder keyDetails(List<GetApplicationImagePolicyConfigKeyDetail> keyDetails) {
            this.keyDetails = Objects.requireNonNull(keyDetails);
            return this;
        }
        public Builder keyDetails(GetApplicationImagePolicyConfigKeyDetail... keyDetails) {
            return keyDetails(List.of(keyDetails));
        }        public GetApplicationImagePolicyConfig build() {
            return new GetApplicationImagePolicyConfig(isPolicyEnabled, keyDetails);
        }
    }
}
