// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Functions.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Functions.outputs.GetApplicationsApplicationImagePolicyConfigKeyDetail;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplicationsApplicationImagePolicyConfig {
    /**
     * @return Define if image signature verification policy is enabled for the application.
     * 
     */
    private final Boolean isPolicyEnabled;
    /**
     * @return A list of KMS key details.
     * 
     */
    private final List<GetApplicationsApplicationImagePolicyConfigKeyDetail> keyDetails;

    @CustomType.Constructor
    private GetApplicationsApplicationImagePolicyConfig(
        @CustomType.Parameter("isPolicyEnabled") Boolean isPolicyEnabled,
        @CustomType.Parameter("keyDetails") List<GetApplicationsApplicationImagePolicyConfigKeyDetail> keyDetails) {
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
    public List<GetApplicationsApplicationImagePolicyConfigKeyDetail> keyDetails() {
        return this.keyDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationsApplicationImagePolicyConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isPolicyEnabled;
        private List<GetApplicationsApplicationImagePolicyConfigKeyDetail> keyDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationsApplicationImagePolicyConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isPolicyEnabled = defaults.isPolicyEnabled;
    	      this.keyDetails = defaults.keyDetails;
        }

        public Builder isPolicyEnabled(Boolean isPolicyEnabled) {
            this.isPolicyEnabled = Objects.requireNonNull(isPolicyEnabled);
            return this;
        }
        public Builder keyDetails(List<GetApplicationsApplicationImagePolicyConfigKeyDetail> keyDetails) {
            this.keyDetails = Objects.requireNonNull(keyDetails);
            return this;
        }
        public Builder keyDetails(GetApplicationsApplicationImagePolicyConfigKeyDetail... keyDetails) {
            return keyDetails(List.of(keyDetails));
        }        public GetApplicationsApplicationImagePolicyConfig build() {
            return new GetApplicationsApplicationImagePolicyConfig(isPolicyEnabled, keyDetails);
        }
    }
}
