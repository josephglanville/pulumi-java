// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeGetArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigLimitsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigLimitsGetArgs Empty = new PreventionInspectTemplateInspectConfigLimitsGetArgs();

    /**
     * Configuration of findings limit given for specified infoTypes.
     * Structure is documented below.
     * 
     */
    @InputImport(name="maxFindingsPerInfoTypes")
      private final @Nullable Output<List<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeGetArgs>> maxFindingsPerInfoTypes;

    public Output<List<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeGetArgs>> getMaxFindingsPerInfoTypes() {
        return this.maxFindingsPerInfoTypes == null ? Output.empty() : this.maxFindingsPerInfoTypes;
    }

    /**
     * Max number of findings that will be returned for each item scanned. The maximum returned is 2000.
     * 
     */
    @InputImport(name="maxFindingsPerItem", required=true)
      private final Output<Integer> maxFindingsPerItem;

    public Output<Integer> getMaxFindingsPerItem() {
        return this.maxFindingsPerItem;
    }

    /**
     * Max number of findings that will be returned per request/job. The maximum returned is 2000.
     * 
     */
    @InputImport(name="maxFindingsPerRequest", required=true)
      private final Output<Integer> maxFindingsPerRequest;

    public Output<Integer> getMaxFindingsPerRequest() {
        return this.maxFindingsPerRequest;
    }

    public PreventionInspectTemplateInspectConfigLimitsGetArgs(
        @Nullable Output<List<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeGetArgs>> maxFindingsPerInfoTypes,
        Output<Integer> maxFindingsPerItem,
        Output<Integer> maxFindingsPerRequest) {
        this.maxFindingsPerInfoTypes = maxFindingsPerInfoTypes;
        this.maxFindingsPerItem = Objects.requireNonNull(maxFindingsPerItem, "expected parameter 'maxFindingsPerItem' to be non-null");
        this.maxFindingsPerRequest = Objects.requireNonNull(maxFindingsPerRequest, "expected parameter 'maxFindingsPerRequest' to be non-null");
    }

    private PreventionInspectTemplateInspectConfigLimitsGetArgs() {
        this.maxFindingsPerInfoTypes = Output.empty();
        this.maxFindingsPerItem = Output.empty();
        this.maxFindingsPerRequest = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigLimitsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeGetArgs>> maxFindingsPerInfoTypes;
        private Output<Integer> maxFindingsPerItem;
        private Output<Integer> maxFindingsPerRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigLimitsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxFindingsPerInfoTypes = defaults.maxFindingsPerInfoTypes;
    	      this.maxFindingsPerItem = defaults.maxFindingsPerItem;
    	      this.maxFindingsPerRequest = defaults.maxFindingsPerRequest;
        }

        public Builder maxFindingsPerInfoTypes(@Nullable Output<List<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeGetArgs>> maxFindingsPerInfoTypes) {
            this.maxFindingsPerInfoTypes = maxFindingsPerInfoTypes;
            return this;
        }

        public Builder maxFindingsPerInfoTypes(@Nullable List<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeGetArgs> maxFindingsPerInfoTypes) {
            this.maxFindingsPerInfoTypes = Output.ofNullable(maxFindingsPerInfoTypes);
            return this;
        }

        public Builder maxFindingsPerItem(Output<Integer> maxFindingsPerItem) {
            this.maxFindingsPerItem = Objects.requireNonNull(maxFindingsPerItem);
            return this;
        }

        public Builder maxFindingsPerItem(Integer maxFindingsPerItem) {
            this.maxFindingsPerItem = Output.of(Objects.requireNonNull(maxFindingsPerItem));
            return this;
        }

        public Builder maxFindingsPerRequest(Output<Integer> maxFindingsPerRequest) {
            this.maxFindingsPerRequest = Objects.requireNonNull(maxFindingsPerRequest);
            return this;
        }

        public Builder maxFindingsPerRequest(Integer maxFindingsPerRequest) {
            this.maxFindingsPerRequest = Output.of(Objects.requireNonNull(maxFindingsPerRequest));
            return this;
        }
        public PreventionInspectTemplateInspectConfigLimitsGetArgs build() {
            return new PreventionInspectTemplateInspectConfigLimitsGetArgs(maxFindingsPerInfoTypes, maxFindingsPerItem, maxFindingsPerRequest);
        }
    }
}
