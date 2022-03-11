// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.licensemanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LicenseConfigurationState extends io.pulumi.resources.ResourceArgs {

    public static final LicenseConfigurationState Empty = new LicenseConfigurationState();

    /**
     * The license configuration ARN.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Description of the license configuration.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Number of licenses managed by the license configuration.
     * 
     */
    @InputImport(name="licenseCount")
      private final @Nullable Output<Integer> licenseCount;

    public Output<Integer> getLicenseCount() {
        return this.licenseCount == null ? Output.empty() : this.licenseCount;
    }

    /**
     * Sets the number of available licenses as a hard limit.
     * 
     */
    @InputImport(name="licenseCountHardLimit")
      private final @Nullable Output<Boolean> licenseCountHardLimit;

    public Output<Boolean> getLicenseCountHardLimit() {
        return this.licenseCountHardLimit == null ? Output.empty() : this.licenseCountHardLimit;
    }

    /**
     * Dimension to use to track license inventory. Specify either `vCPU`, `Instance`, `Core` or `Socket`.
     * 
     */
    @InputImport(name="licenseCountingType")
      private final @Nullable Output<String> licenseCountingType;

    public Output<String> getLicenseCountingType() {
        return this.licenseCountingType == null ? Output.empty() : this.licenseCountingType;
    }

    /**
     * Array of configured License Manager rules.
     * 
     */
    @InputImport(name="licenseRules")
      private final @Nullable Output<List<String>> licenseRules;

    public Output<List<String>> getLicenseRules() {
        return this.licenseRules == null ? Output.empty() : this.licenseRules;
    }

    /**
     * Name of the license configuration.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Account ID of the owner of the license configuration.
     * 
     */
    @InputImport(name="ownerAccountId")
      private final @Nullable Output<String> ownerAccountId;

    public Output<String> getOwnerAccountId() {
        return this.ownerAccountId == null ? Output.empty() : this.ownerAccountId;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public LicenseConfigurationState(
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<Integer> licenseCount,
        @Nullable Output<Boolean> licenseCountHardLimit,
        @Nullable Output<String> licenseCountingType,
        @Nullable Output<List<String>> licenseRules,
        @Nullable Output<String> name,
        @Nullable Output<String> ownerAccountId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.description = description;
        this.licenseCount = licenseCount;
        this.licenseCountHardLimit = licenseCountHardLimit;
        this.licenseCountingType = licenseCountingType;
        this.licenseRules = licenseRules;
        this.name = name;
        this.ownerAccountId = ownerAccountId;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private LicenseConfigurationState() {
        this.arn = Output.empty();
        this.description = Output.empty();
        this.licenseCount = Output.empty();
        this.licenseCountHardLimit = Output.empty();
        this.licenseCountingType = Output.empty();
        this.licenseRules = Output.empty();
        this.name = Output.empty();
        this.ownerAccountId = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<Integer> licenseCount;
        private @Nullable Output<Boolean> licenseCountHardLimit;
        private @Nullable Output<String> licenseCountingType;
        private @Nullable Output<List<String>> licenseRules;
        private @Nullable Output<String> name;
        private @Nullable Output<String> ownerAccountId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseConfigurationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.licenseCount = defaults.licenseCount;
    	      this.licenseCountHardLimit = defaults.licenseCountHardLimit;
    	      this.licenseCountingType = defaults.licenseCountingType;
    	      this.licenseRules = defaults.licenseRules;
    	      this.name = defaults.name;
    	      this.ownerAccountId = defaults.ownerAccountId;
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

        public Builder licenseCount(@Nullable Output<Integer> licenseCount) {
            this.licenseCount = licenseCount;
            return this;
        }

        public Builder licenseCount(@Nullable Integer licenseCount) {
            this.licenseCount = Output.ofNullable(licenseCount);
            return this;
        }

        public Builder licenseCountHardLimit(@Nullable Output<Boolean> licenseCountHardLimit) {
            this.licenseCountHardLimit = licenseCountHardLimit;
            return this;
        }

        public Builder licenseCountHardLimit(@Nullable Boolean licenseCountHardLimit) {
            this.licenseCountHardLimit = Output.ofNullable(licenseCountHardLimit);
            return this;
        }

        public Builder licenseCountingType(@Nullable Output<String> licenseCountingType) {
            this.licenseCountingType = licenseCountingType;
            return this;
        }

        public Builder licenseCountingType(@Nullable String licenseCountingType) {
            this.licenseCountingType = Output.ofNullable(licenseCountingType);
            return this;
        }

        public Builder licenseRules(@Nullable Output<List<String>> licenseRules) {
            this.licenseRules = licenseRules;
            return this;
        }

        public Builder licenseRules(@Nullable List<String> licenseRules) {
            this.licenseRules = Output.ofNullable(licenseRules);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder ownerAccountId(@Nullable Output<String> ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }

        public Builder ownerAccountId(@Nullable String ownerAccountId) {
            this.ownerAccountId = Output.ofNullable(ownerAccountId);
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
        }
        public LicenseConfigurationState build() {
            return new LicenseConfigurationState(arn, description, licenseCount, licenseCountHardLimit, licenseCountingType, licenseRules, name, ownerAccountId, tags, tagsAll);
        }
    }
}
