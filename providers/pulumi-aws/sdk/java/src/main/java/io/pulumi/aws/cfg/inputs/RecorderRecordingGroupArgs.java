// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RecorderRecordingGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecorderRecordingGroupArgs Empty = new RecorderRecordingGroupArgs();

    /**
     * Specifies whether AWS Config records configuration changes for every supported type of regional resource (which includes any new type that will become supported in the future). Conflicts with `resource_types`. Defaults to `true`.
     * 
     */
    @Import(name="allSupported")
      private final @Nullable Output<Boolean> allSupported;

    public Output<Boolean> getAllSupported() {
        return this.allSupported == null ? Output.empty() : this.allSupported;
    }

    /**
     * Specifies whether AWS Config includes all supported types of *global resources* with the resources that it records. Requires `all_supported = true`. Conflicts with `resource_types`.
     * 
     */
    @Import(name="includeGlobalResourceTypes")
      private final @Nullable Output<Boolean> includeGlobalResourceTypes;

    public Output<Boolean> getIncludeGlobalResourceTypes() {
        return this.includeGlobalResourceTypes == null ? Output.empty() : this.includeGlobalResourceTypes;
    }

    /**
     * A list that specifies the types of AWS resources for which AWS Config records configuration changes (for example, `AWS::EC2::Instance` or `AWS::CloudTrail::Trail`). See [relevant part of AWS Docs](http://docs.aws.amazon.com/config/latest/APIReference/API_ResourceIdentifier.html#config-Type-ResourceIdentifier-resourceType) for available types. In order to use this attribute, `all_supported` must be set to false.
     * 
     */
    @Import(name="resourceTypes")
      private final @Nullable Output<List<String>> resourceTypes;

    public Output<List<String>> getResourceTypes() {
        return this.resourceTypes == null ? Output.empty() : this.resourceTypes;
    }

    public RecorderRecordingGroupArgs(
        @Nullable Output<Boolean> allSupported,
        @Nullable Output<Boolean> includeGlobalResourceTypes,
        @Nullable Output<List<String>> resourceTypes) {
        this.allSupported = allSupported;
        this.includeGlobalResourceTypes = includeGlobalResourceTypes;
        this.resourceTypes = resourceTypes;
    }

    private RecorderRecordingGroupArgs() {
        this.allSupported = Output.empty();
        this.includeGlobalResourceTypes = Output.empty();
        this.resourceTypes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecorderRecordingGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allSupported;
        private @Nullable Output<Boolean> includeGlobalResourceTypes;
        private @Nullable Output<List<String>> resourceTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(RecorderRecordingGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allSupported = defaults.allSupported;
    	      this.includeGlobalResourceTypes = defaults.includeGlobalResourceTypes;
    	      this.resourceTypes = defaults.resourceTypes;
        }

        public Builder allSupported(@Nullable Output<Boolean> allSupported) {
            this.allSupported = allSupported;
            return this;
        }
        public Builder allSupported(@Nullable Boolean allSupported) {
            this.allSupported = Output.ofNullable(allSupported);
            return this;
        }
        public Builder includeGlobalResourceTypes(@Nullable Output<Boolean> includeGlobalResourceTypes) {
            this.includeGlobalResourceTypes = includeGlobalResourceTypes;
            return this;
        }
        public Builder includeGlobalResourceTypes(@Nullable Boolean includeGlobalResourceTypes) {
            this.includeGlobalResourceTypes = Output.ofNullable(includeGlobalResourceTypes);
            return this;
        }
        public Builder resourceTypes(@Nullable Output<List<String>> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public Builder resourceTypes(@Nullable List<String> resourceTypes) {
            this.resourceTypes = Output.ofNullable(resourceTypes);
            return this;
        }
        public Builder resourceTypes(String... resourceTypes) {
            return resourceTypes(List.of(resourceTypes));
        }        public RecorderRecordingGroupArgs build() {
            return new RecorderRecordingGroupArgs(allSupported, includeGlobalResourceTypes, resourceTypes);
        }
    }
}
