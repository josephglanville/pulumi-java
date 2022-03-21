// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dataflow_v1b3.inputs.DisplayDataResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Description of the type, names/ids, and input/outputs for a transform.
 * 
 */
public final class TransformSummaryResponse extends io.pulumi.resources.InvokeArgs {

    public static final TransformSummaryResponse Empty = new TransformSummaryResponse();

    /**
     * Transform-specific display data.
     * 
     */
    @Import(name="displayData", required=true)
      private final List<DisplayDataResponse> displayData;

    public List<DisplayDataResponse> getDisplayData() {
        return this.displayData;
    }

    /**
     * User names for all collection inputs to this transform.
     * 
     */
    @Import(name="inputCollectionName", required=true)
      private final List<String> inputCollectionName;

    public List<String> getInputCollectionName() {
        return this.inputCollectionName;
    }

    /**
     * Type of transform.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * User provided name for this transform instance.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * User names for all collection outputs to this transform.
     * 
     */
    @Import(name="outputCollectionName", required=true)
      private final List<String> outputCollectionName;

    public List<String> getOutputCollectionName() {
        return this.outputCollectionName;
    }

    public TransformSummaryResponse(
        List<DisplayDataResponse> displayData,
        List<String> inputCollectionName,
        String kind,
        String name,
        List<String> outputCollectionName) {
        this.displayData = Objects.requireNonNull(displayData, "expected parameter 'displayData' to be non-null");
        this.inputCollectionName = Objects.requireNonNull(inputCollectionName, "expected parameter 'inputCollectionName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.outputCollectionName = Objects.requireNonNull(outputCollectionName, "expected parameter 'outputCollectionName' to be non-null");
    }

    private TransformSummaryResponse() {
        this.displayData = List.of();
        this.inputCollectionName = List.of();
        this.kind = null;
        this.name = null;
        this.outputCollectionName = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransformSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DisplayDataResponse> displayData;
        private List<String> inputCollectionName;
        private String kind;
        private String name;
        private List<String> outputCollectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(TransformSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayData = defaults.displayData;
    	      this.inputCollectionName = defaults.inputCollectionName;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.outputCollectionName = defaults.outputCollectionName;
        }

        public Builder displayData(List<DisplayDataResponse> displayData) {
            this.displayData = Objects.requireNonNull(displayData);
            return this;
        }
        public Builder displayData(DisplayDataResponse... displayData) {
            return displayData(List.of(displayData));
        }
        public Builder inputCollectionName(List<String> inputCollectionName) {
            this.inputCollectionName = Objects.requireNonNull(inputCollectionName);
            return this;
        }
        public Builder inputCollectionName(String... inputCollectionName) {
            return inputCollectionName(List.of(inputCollectionName));
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder outputCollectionName(List<String> outputCollectionName) {
            this.outputCollectionName = Objects.requireNonNull(outputCollectionName);
            return this;
        }
        public Builder outputCollectionName(String... outputCollectionName) {
            return outputCollectionName(List.of(outputCollectionName));
        }        public TransformSummaryResponse build() {
            return new TransformSummaryResponse(displayData, inputCollectionName, kind, name, outputCollectionName);
        }
    }
}
