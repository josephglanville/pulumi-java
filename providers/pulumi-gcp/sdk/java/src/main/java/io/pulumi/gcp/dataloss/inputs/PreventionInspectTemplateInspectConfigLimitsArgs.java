// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigLimitsArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigLimitsArgs Empty = new PreventionInspectTemplateInspectConfigLimitsArgs();

    /**
     * Configuration of findings limit given for specified infoTypes.
     * Structure is documented below.
     * 
     */
    @InputImport(name="maxFindingsPerInfoTypes")
      private final @Nullable Input<List<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs>> maxFindingsPerInfoTypes;

    public Input<List<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs>> getMaxFindingsPerInfoTypes() {
        return this.maxFindingsPerInfoTypes == null ? Input.empty() : this.maxFindingsPerInfoTypes;
    }

    /**
     * Max number of findings that will be returned for each item scanned. The maximum returned is 2000.
     * 
     */
    @InputImport(name="maxFindingsPerItem", required=true)
      private final Input<Integer> maxFindingsPerItem;

    public Input<Integer> getMaxFindingsPerItem() {
        return this.maxFindingsPerItem;
    }

    /**
     * Max number of findings that will be returned per request/job. The maximum returned is 2000.
     * 
     */
    @InputImport(name="maxFindingsPerRequest", required=true)
      private final Input<Integer> maxFindingsPerRequest;

    public Input<Integer> getMaxFindingsPerRequest() {
        return this.maxFindingsPerRequest;
    }

    public PreventionInspectTemplateInspectConfigLimitsArgs(
        @Nullable Input<List<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs>> maxFindingsPerInfoTypes,
        Input<Integer> maxFindingsPerItem,
        Input<Integer> maxFindingsPerRequest) {
        this.maxFindingsPerInfoTypes = maxFindingsPerInfoTypes;
        this.maxFindingsPerItem = Objects.requireNonNull(maxFindingsPerItem, "expected parameter 'maxFindingsPerItem' to be non-null");
        this.maxFindingsPerRequest = Objects.requireNonNull(maxFindingsPerRequest, "expected parameter 'maxFindingsPerRequest' to be non-null");
    }

    private PreventionInspectTemplateInspectConfigLimitsArgs() {
        this.maxFindingsPerInfoTypes = Input.empty();
        this.maxFindingsPerItem = Input.empty();
        this.maxFindingsPerRequest = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs>> maxFindingsPerInfoTypes;
        private Input<Integer> maxFindingsPerItem;
        private Input<Integer> maxFindingsPerRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigLimitsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxFindingsPerInfoTypes = defaults.maxFindingsPerInfoTypes;
    	      this.maxFindingsPerItem = defaults.maxFindingsPerItem;
    	      this.maxFindingsPerRequest = defaults.maxFindingsPerRequest;
        }

        public Builder setMaxFindingsPerInfoTypes(@Nullable Input<List<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs>> maxFindingsPerInfoTypes) {
            this.maxFindingsPerInfoTypes = maxFindingsPerInfoTypes;
            return this;
        }

        public Builder setMaxFindingsPerInfoTypes(@Nullable List<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs> maxFindingsPerInfoTypes) {
            this.maxFindingsPerInfoTypes = Input.ofNullable(maxFindingsPerInfoTypes);
            return this;
        }

        public Builder setMaxFindingsPerItem(Input<Integer> maxFindingsPerItem) {
            this.maxFindingsPerItem = Objects.requireNonNull(maxFindingsPerItem);
            return this;
        }

        public Builder setMaxFindingsPerItem(Integer maxFindingsPerItem) {
            this.maxFindingsPerItem = Input.of(Objects.requireNonNull(maxFindingsPerItem));
            return this;
        }

        public Builder setMaxFindingsPerRequest(Input<Integer> maxFindingsPerRequest) {
            this.maxFindingsPerRequest = Objects.requireNonNull(maxFindingsPerRequest);
            return this;
        }

        public Builder setMaxFindingsPerRequest(Integer maxFindingsPerRequest) {
            this.maxFindingsPerRequest = Input.of(Objects.requireNonNull(maxFindingsPerRequest));
            return this;
        }
        public PreventionInspectTemplateInspectConfigLimitsArgs build() {
            return new PreventionInspectTemplateInspectConfigLimitsArgs(maxFindingsPerInfoTypes, maxFindingsPerItem, maxFindingsPerRequest);
        }
    }
}
