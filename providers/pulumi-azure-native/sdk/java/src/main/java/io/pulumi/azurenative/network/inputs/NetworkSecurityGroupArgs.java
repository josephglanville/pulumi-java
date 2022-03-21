// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.SecurityRuleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NetworkSecurityGroup resource.
 * 
 */
public final class NetworkSecurityGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkSecurityGroupArgs Empty = new NetworkSecurityGroupArgs();

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * A collection of security rules of the network security group.
     * 
     */
    @Import(name="securityRules")
      private final @Nullable Output<List<SecurityRuleArgs>> securityRules;

    public Output<List<SecurityRuleArgs>> getSecurityRules() {
        return this.securityRules == null ? Output.empty() : this.securityRules;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public NetworkSecurityGroupArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> location,
        @Nullable Output<List<SecurityRuleArgs>> securityRules,
        @Nullable Output<Map<String,String>> tags) {
        this.id = id;
        this.location = location;
        this.securityRules = securityRules;
        this.tags = tags;
    }

    private NetworkSecurityGroupArgs() {
        this.id = Output.empty();
        this.location = Output.empty();
        this.securityRules = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkSecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> location;
        private @Nullable Output<List<SecurityRuleArgs>> securityRules;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkSecurityGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.securityRules = defaults.securityRules;
    	      this.tags = defaults.tags;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder securityRules(@Nullable Output<List<SecurityRuleArgs>> securityRules) {
            this.securityRules = securityRules;
            return this;
        }
        public Builder securityRules(@Nullable List<SecurityRuleArgs> securityRules) {
            this.securityRules = Output.ofNullable(securityRules);
            return this;
        }
        public Builder securityRules(SecurityRuleArgs... securityRules) {
            return securityRules(List.of(securityRules));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public NetworkSecurityGroupArgs build() {
            return new NetworkSecurityGroupArgs(id, location, securityRules, tags);
        }
    }
}
