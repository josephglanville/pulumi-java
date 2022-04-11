// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FindingAggregatorArgs extends io.pulumi.resources.ResourceArgs {

    public static final FindingAggregatorArgs Empty = new FindingAggregatorArgs();

    /**
     * Indicates whether to aggregate findings from all of the available Regions or from a specified list. The options are `ALL_REGIONS`, `ALL_REGIONS_EXCEPT_SPECIFIED` or `SPECIFIED_REGIONS`. When `ALL_REGIONS` or `ALL_REGIONS_EXCEPT_SPECIFIED` are used, Security Hub will automatically aggregate findings from new Regions as Security Hub supports them and you opt into them.
     * 
     */
    @Import(name="linkingMode", required=true)
      private final Output<String> linkingMode;

    public Output<String> getLinkingMode() {
        return this.linkingMode;
    }

    /**
     * List of regions to include or exclude (required if `linking_mode` is set to `ALL_REGIONS_EXCEPT_SPECIFIED` or `SPECIFIED_REGIONS`)
     * 
     */
    @Import(name="specifiedRegions")
      private final @Nullable Output<List<String>> specifiedRegions;

    public Output<List<String>> getSpecifiedRegions() {
        return this.specifiedRegions == null ? Codegen.empty() : this.specifiedRegions;
    }

    public FindingAggregatorArgs(
        Output<String> linkingMode,
        @Nullable Output<List<String>> specifiedRegions) {
        this.linkingMode = Objects.requireNonNull(linkingMode, "expected parameter 'linkingMode' to be non-null");
        this.specifiedRegions = specifiedRegions;
    }

    private FindingAggregatorArgs() {
        this.linkingMode = Codegen.empty();
        this.specifiedRegions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FindingAggregatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> linkingMode;
        private @Nullable Output<List<String>> specifiedRegions;

        public Builder() {
    	      // Empty
        }

        public Builder(FindingAggregatorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkingMode = defaults.linkingMode;
    	      this.specifiedRegions = defaults.specifiedRegions;
        }

        public Builder linkingMode(Output<String> linkingMode) {
            this.linkingMode = Objects.requireNonNull(linkingMode);
            return this;
        }
        public Builder linkingMode(String linkingMode) {
            this.linkingMode = Output.of(Objects.requireNonNull(linkingMode));
            return this;
        }
        public Builder specifiedRegions(@Nullable Output<List<String>> specifiedRegions) {
            this.specifiedRegions = specifiedRegions;
            return this;
        }
        public Builder specifiedRegions(@Nullable List<String> specifiedRegions) {
            this.specifiedRegions = Codegen.ofNullable(specifiedRegions);
            return this;
        }
        public Builder specifiedRegions(String... specifiedRegions) {
            return specifiedRegions(List.of(specifiedRegions));
        }        public FindingAggregatorArgs build() {
            return new FindingAggregatorArgs(linkingMode, specifiedRegions);
        }
    }
}
