// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.enums.AccessPointNetworkOrigin;
import io.pulumi.awsnative.s3.outputs.PolicyStatusProperties;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccessPointResult {
    /**
     * The alias of this Access Point. This alias can be used for compatibility purposes with other AWS services and third-party applications.
     * 
     */
    private final @Nullable String alias;
    /**
     * The Amazon Resource Name (ARN) of the specified accesspoint.
     * 
     */
    private final @Nullable String arn;
    /**
     * Indicates whether this Access Point allows access from the public Internet. If VpcConfiguration is specified for this Access Point, then NetworkOrigin is VPC, and the Access Point doesn't allow access from the public Internet. Otherwise, NetworkOrigin is Internet, and the Access Point allows access from the public Internet, subject to the Access Point and bucket access policies.
     * 
     */
    private final @Nullable AccessPointNetworkOrigin networkOrigin;
    /**
     * The Access Point Policy you want to apply to this access point.
     * 
     */
    private final @Nullable Object policy;
    private final @Nullable PolicyStatusProperties policyStatus;

    @CustomType.Constructor
    private GetAccessPointResult(
        @CustomType.Parameter("alias") @Nullable String alias,
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("networkOrigin") @Nullable AccessPointNetworkOrigin networkOrigin,
        @CustomType.Parameter("policy") @Nullable Object policy,
        @CustomType.Parameter("policyStatus") @Nullable PolicyStatusProperties policyStatus) {
        this.alias = alias;
        this.arn = arn;
        this.networkOrigin = networkOrigin;
        this.policy = policy;
        this.policyStatus = policyStatus;
    }

    /**
     * The alias of this Access Point. This alias can be used for compatibility purposes with other AWS services and third-party applications.
     * 
    */
    public Optional<String> getAlias() {
        return Optional.ofNullable(this.alias);
    }
    /**
     * The Amazon Resource Name (ARN) of the specified accesspoint.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Indicates whether this Access Point allows access from the public Internet. If VpcConfiguration is specified for this Access Point, then NetworkOrigin is VPC, and the Access Point doesn't allow access from the public Internet. Otherwise, NetworkOrigin is Internet, and the Access Point allows access from the public Internet, subject to the Access Point and bucket access policies.
     * 
    */
    public Optional<AccessPointNetworkOrigin> getNetworkOrigin() {
        return Optional.ofNullable(this.networkOrigin);
    }
    /**
     * The Access Point Policy you want to apply to this access point.
     * 
    */
    public Optional<Object> getPolicy() {
        return Optional.ofNullable(this.policy);
    }
    public Optional<PolicyStatusProperties> getPolicyStatus() {
        return Optional.ofNullable(this.policyStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPointResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alias;
        private @Nullable String arn;
        private @Nullable AccessPointNetworkOrigin networkOrigin;
        private @Nullable Object policy;
        private @Nullable PolicyStatusProperties policyStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.arn = defaults.arn;
    	      this.networkOrigin = defaults.networkOrigin;
    	      this.policy = defaults.policy;
    	      this.policyStatus = defaults.policyStatus;
        }

        public Builder alias(@Nullable String alias) {
            this.alias = alias;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder networkOrigin(@Nullable AccessPointNetworkOrigin networkOrigin) {
            this.networkOrigin = networkOrigin;
            return this;
        }
        public Builder policy(@Nullable Object policy) {
            this.policy = policy;
            return this;
        }
        public Builder policyStatus(@Nullable PolicyStatusProperties policyStatus) {
            this.policyStatus = policyStatus;
            return this;
        }        public GetAccessPointResult build() {
            return new GetAccessPointResult(alias, arn, networkOrigin, policy, policyStatus);
        }
    }
}
