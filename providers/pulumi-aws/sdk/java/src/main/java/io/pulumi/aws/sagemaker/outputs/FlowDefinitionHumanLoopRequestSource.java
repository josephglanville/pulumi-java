// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FlowDefinitionHumanLoopRequestSource {
    /**
     * Specifies whether Amazon Rekognition or Amazon Textract are used as the integration source. Valid values are: `AWS/Rekognition/DetectModerationLabels/Image/V3` and `AWS/Textract/AnalyzeDocument/Forms/V1`.
     * 
     */
    private final String awsManagedHumanLoopRequestSource;

    @OutputCustomType.Constructor
    private FlowDefinitionHumanLoopRequestSource(@OutputCustomType.Parameter("awsManagedHumanLoopRequestSource") String awsManagedHumanLoopRequestSource) {
        this.awsManagedHumanLoopRequestSource = awsManagedHumanLoopRequestSource;
    }

    /**
     * Specifies whether Amazon Rekognition or Amazon Textract are used as the integration source. Valid values are: `AWS/Rekognition/DetectModerationLabels/Image/V3` and `AWS/Textract/AnalyzeDocument/Forms/V1`.
     * 
    */
    public String getAwsManagedHumanLoopRequestSource() {
        return this.awsManagedHumanLoopRequestSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDefinitionHumanLoopRequestSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String awsManagedHumanLoopRequestSource;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDefinitionHumanLoopRequestSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsManagedHumanLoopRequestSource = defaults.awsManagedHumanLoopRequestSource;
        }

        public Builder setAwsManagedHumanLoopRequestSource(String awsManagedHumanLoopRequestSource) {
            this.awsManagedHumanLoopRequestSource = Objects.requireNonNull(awsManagedHumanLoopRequestSource);
            return this;
        }
        public FlowDefinitionHumanLoopRequestSource build() {
            return new FlowDefinitionHumanLoopRequestSource(awsManagedHumanLoopRequestSource);
        }
    }
}
