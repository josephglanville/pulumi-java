// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.inputs.DashboardDataSetReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * <p>Dashboard source template.</p>
 * 
 */
public final class DashboardSourceTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final DashboardSourceTemplateArgs Empty = new DashboardSourceTemplateArgs();

    /**
     * <p>The Amazon Resource Name (ARN) of the resource.</p>
     * 
     */
    @InputImport(name="arn", required=true)
      private final Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }

    /**
     * <p>Dataset references.</p>
     * 
     */
    @InputImport(name="dataSetReferences", required=true)
      private final Output<List<DashboardDataSetReferenceArgs>> dataSetReferences;

    public Output<List<DashboardDataSetReferenceArgs>> getDataSetReferences() {
        return this.dataSetReferences;
    }

    public DashboardSourceTemplateArgs(
        Output<String> arn,
        Output<List<DashboardDataSetReferenceArgs>> dataSetReferences) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.dataSetReferences = Objects.requireNonNull(dataSetReferences, "expected parameter 'dataSetReferences' to be non-null");
    }

    private DashboardSourceTemplateArgs() {
        this.arn = Output.empty();
        this.dataSetReferences = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardSourceTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> arn;
        private Output<List<DashboardDataSetReferenceArgs>> dataSetReferences;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardSourceTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dataSetReferences = defaults.dataSetReferences;
        }

        public Builder arn(Output<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder arn(String arn) {
            this.arn = Output.of(Objects.requireNonNull(arn));
            return this;
        }

        public Builder dataSetReferences(Output<List<DashboardDataSetReferenceArgs>> dataSetReferences) {
            this.dataSetReferences = Objects.requireNonNull(dataSetReferences);
            return this;
        }

        public Builder dataSetReferences(List<DashboardDataSetReferenceArgs> dataSetReferences) {
            this.dataSetReferences = Output.of(Objects.requireNonNull(dataSetReferences));
            return this;
        }
        public DashboardSourceTemplateArgs build() {
            return new DashboardSourceTemplateArgs(arn, dataSetReferences);
        }
    }
}
