// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcIpamScopeState extends io.pulumi.resources.ResourceArgs {

    public static final VpcIpamScopeState Empty = new VpcIpamScopeState();

    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * A description for the scope you're creating.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The ARN of the IPAM for which you're creating this scope.
     * 
     */
    @Import(name="ipamArn")
      private final @Nullable Output<String> ipamArn;

    public Output<String> getIpamArn() {
        return this.ipamArn == null ? Output.empty() : this.ipamArn;
    }

    /**
     * The ID of the IPAM for which you're creating this scope.
     * 
     */
    @Import(name="ipamId")
      private final @Nullable Output<String> ipamId;

    public Output<String> getIpamId() {
        return this.ipamId == null ? Output.empty() : this.ipamId;
    }

    @Import(name="ipamScopeType")
      private final @Nullable Output<String> ipamScopeType;

    public Output<String> getIpamScopeType() {
        return this.ipamScopeType == null ? Output.empty() : this.ipamScopeType;
    }

    /**
     * Defines if the scope is the default scope or not.
     * 
     */
    @Import(name="isDefault")
      private final @Nullable Output<Boolean> isDefault;

    public Output<Boolean> getIsDefault() {
        return this.isDefault == null ? Output.empty() : this.isDefault;
    }

    /**
     * Count of pools under this scope
     * 
     */
    @Import(name="poolCount")
      private final @Nullable Output<Integer> poolCount;

    public Output<Integer> getPoolCount() {
        return this.poolCount == null ? Output.empty() : this.poolCount;
    }

    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public VpcIpamScopeState(
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<String> ipamArn,
        @Nullable Output<String> ipamId,
        @Nullable Output<String> ipamScopeType,
        @Nullable Output<Boolean> isDefault,
        @Nullable Output<Integer> poolCount,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.description = description;
        this.ipamArn = ipamArn;
        this.ipamId = ipamId;
        this.ipamScopeType = ipamScopeType;
        this.isDefault = isDefault;
        this.poolCount = poolCount;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private VpcIpamScopeState() {
        this.arn = Output.empty();
        this.description = Output.empty();
        this.ipamArn = Output.empty();
        this.ipamId = Output.empty();
        this.ipamScopeType = Output.empty();
        this.isDefault = Output.empty();
        this.poolCount = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcIpamScopeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<String> ipamArn;
        private @Nullable Output<String> ipamId;
        private @Nullable Output<String> ipamScopeType;
        private @Nullable Output<Boolean> isDefault;
        private @Nullable Output<Integer> poolCount;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcIpamScopeState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.ipamArn = defaults.ipamArn;
    	      this.ipamId = defaults.ipamId;
    	      this.ipamScopeType = defaults.ipamScopeType;
    	      this.isDefault = defaults.isDefault;
    	      this.poolCount = defaults.poolCount;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder ipamArn(@Nullable Output<String> ipamArn) {
            this.ipamArn = ipamArn;
            return this;
        }
        public Builder ipamArn(@Nullable String ipamArn) {
            this.ipamArn = Output.ofNullable(ipamArn);
            return this;
        }
        public Builder ipamId(@Nullable Output<String> ipamId) {
            this.ipamId = ipamId;
            return this;
        }
        public Builder ipamId(@Nullable String ipamId) {
            this.ipamId = Output.ofNullable(ipamId);
            return this;
        }
        public Builder ipamScopeType(@Nullable Output<String> ipamScopeType) {
            this.ipamScopeType = ipamScopeType;
            return this;
        }
        public Builder ipamScopeType(@Nullable String ipamScopeType) {
            this.ipamScopeType = Output.ofNullable(ipamScopeType);
            return this;
        }
        public Builder isDefault(@Nullable Output<Boolean> isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Builder isDefault(@Nullable Boolean isDefault) {
            this.isDefault = Output.ofNullable(isDefault);
            return this;
        }
        public Builder poolCount(@Nullable Output<Integer> poolCount) {
            this.poolCount = poolCount;
            return this;
        }
        public Builder poolCount(@Nullable Integer poolCount) {
            this.poolCount = Output.ofNullable(poolCount);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }        public VpcIpamScopeState build() {
            return new VpcIpamScopeState(arn, description, ipamArn, ipamId, ipamScopeType, isDefault, poolCount, tags, tagsAll);
        }
    }
}
