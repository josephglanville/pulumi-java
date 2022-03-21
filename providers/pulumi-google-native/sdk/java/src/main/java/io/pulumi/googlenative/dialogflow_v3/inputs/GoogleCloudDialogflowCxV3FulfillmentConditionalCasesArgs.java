// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A list of cascading if-else conditions. Cases are mutually exclusive. The first one with a matching condition is selected, all the rest ignored.
 * 
 */
public final class GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs Empty = new GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs();

    /**
     * A list of cascading if-else conditions.
     * 
     */
    @Import(name="cases")
      private final @Nullable Output<List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseArgs>> cases;

    public Output<List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseArgs>> getCases() {
        return this.cases == null ? Output.empty() : this.cases;
    }

    public GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs(@Nullable Output<List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseArgs>> cases) {
        this.cases = cases;
    }

    private GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs() {
        this.cases = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseArgs>> cases;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cases = defaults.cases;
        }

        public Builder cases(@Nullable Output<List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseArgs>> cases) {
            this.cases = cases;
            return this;
        }
        public Builder cases(@Nullable List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseArgs> cases) {
            this.cases = Output.ofNullable(cases);
            return this;
        }
        public Builder cases(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseArgs... cases) {
            return cases(List.of(cases));
        }        public GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs build() {
            return new GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs(cases);
        }
    }
}
