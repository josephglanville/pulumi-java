// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudsearch;

import io.pulumi.aws.cloudsearch.inputs.DomainEndpointOptionsArgs;
import io.pulumi.aws.cloudsearch.inputs.DomainIndexFieldArgs;
import io.pulumi.aws.cloudsearch.inputs.DomainScalingParametersArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainArgs Empty = new DomainArgs();

    /**
     * Domain endpoint options. Documented below.
     * 
     */
    @Import(name="endpointOptions")
      private final @Nullable Output<DomainEndpointOptionsArgs> endpointOptions;

    public Output<DomainEndpointOptionsArgs> getEndpointOptions() {
        return this.endpointOptions == null ? Output.empty() : this.endpointOptions;
    }

    /**
     * The index fields for documents added to the domain. Documented below.
     * 
     */
    @Import(name="indexFields")
      private final @Nullable Output<List<DomainIndexFieldArgs>> indexFields;

    public Output<List<DomainIndexFieldArgs>> getIndexFields() {
        return this.indexFields == null ? Output.empty() : this.indexFields;
    }

    /**
     * Whether or not to maintain extra instances for the domain in a second Availability Zone to ensure high availability.
     * 
     */
    @Import(name="multiAz")
      private final @Nullable Output<Boolean> multiAz;

    public Output<Boolean> getMultiAz() {
        return this.multiAz == null ? Output.empty() : this.multiAz;
    }

    /**
     * A unique name for the field. Field names must begin with a letter and be at least 3 and no more than 64 characters long. The allowed characters are: `a`-`z` (lower-case letters), `0`-`9`, and `_` (underscore). The name `score` is reserved and cannot be used as a field name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Domain scaling parameters. Documented below.
     * 
     */
    @Import(name="scalingParameters")
      private final @Nullable Output<DomainScalingParametersArgs> scalingParameters;

    public Output<DomainScalingParametersArgs> getScalingParameters() {
        return this.scalingParameters == null ? Output.empty() : this.scalingParameters;
    }

    public DomainArgs(
        @Nullable Output<DomainEndpointOptionsArgs> endpointOptions,
        @Nullable Output<List<DomainIndexFieldArgs>> indexFields,
        @Nullable Output<Boolean> multiAz,
        @Nullable Output<String> name,
        @Nullable Output<DomainScalingParametersArgs> scalingParameters) {
        this.endpointOptions = endpointOptions;
        this.indexFields = indexFields;
        this.multiAz = multiAz;
        this.name = name;
        this.scalingParameters = scalingParameters;
    }

    private DomainArgs() {
        this.endpointOptions = Output.empty();
        this.indexFields = Output.empty();
        this.multiAz = Output.empty();
        this.name = Output.empty();
        this.scalingParameters = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DomainEndpointOptionsArgs> endpointOptions;
        private @Nullable Output<List<DomainIndexFieldArgs>> indexFields;
        private @Nullable Output<Boolean> multiAz;
        private @Nullable Output<String> name;
        private @Nullable Output<DomainScalingParametersArgs> scalingParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointOptions = defaults.endpointOptions;
    	      this.indexFields = defaults.indexFields;
    	      this.multiAz = defaults.multiAz;
    	      this.name = defaults.name;
    	      this.scalingParameters = defaults.scalingParameters;
        }

        public Builder endpointOptions(@Nullable Output<DomainEndpointOptionsArgs> endpointOptions) {
            this.endpointOptions = endpointOptions;
            return this;
        }
        public Builder endpointOptions(@Nullable DomainEndpointOptionsArgs endpointOptions) {
            this.endpointOptions = Output.ofNullable(endpointOptions);
            return this;
        }
        public Builder indexFields(@Nullable Output<List<DomainIndexFieldArgs>> indexFields) {
            this.indexFields = indexFields;
            return this;
        }
        public Builder indexFields(@Nullable List<DomainIndexFieldArgs> indexFields) {
            this.indexFields = Output.ofNullable(indexFields);
            return this;
        }
        public Builder indexFields(DomainIndexFieldArgs... indexFields) {
            return indexFields(List.of(indexFields));
        }
        public Builder multiAz(@Nullable Output<Boolean> multiAz) {
            this.multiAz = multiAz;
            return this;
        }
        public Builder multiAz(@Nullable Boolean multiAz) {
            this.multiAz = Output.ofNullable(multiAz);
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
        public Builder scalingParameters(@Nullable Output<DomainScalingParametersArgs> scalingParameters) {
            this.scalingParameters = scalingParameters;
            return this;
        }
        public Builder scalingParameters(@Nullable DomainScalingParametersArgs scalingParameters) {
            this.scalingParameters = Output.ofNullable(scalingParameters);
            return this;
        }        public DomainArgs build() {
            return new DomainArgs(endpointOptions, indexFields, multiAz, name, scalingParameters);
        }
    }
}