// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wisdom.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AssistantAssociationAssociationDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssistantAssociationAssociationDataArgs Empty = new AssistantAssociationAssociationDataArgs();

    @InputImport(name="knowledgeBaseId", required=true)
      private final Input<String> knowledgeBaseId;

    public Input<String> getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public AssistantAssociationAssociationDataArgs(Input<String> knowledgeBaseId) {
        this.knowledgeBaseId = Objects.requireNonNull(knowledgeBaseId, "expected parameter 'knowledgeBaseId' to be non-null");
    }

    private AssistantAssociationAssociationDataArgs() {
        this.knowledgeBaseId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssistantAssociationAssociationDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> knowledgeBaseId;

        public Builder() {
    	      // Empty
        }

        public Builder(AssistantAssociationAssociationDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.knowledgeBaseId = defaults.knowledgeBaseId;
        }

        public Builder setKnowledgeBaseId(Input<String> knowledgeBaseId) {
            this.knowledgeBaseId = Objects.requireNonNull(knowledgeBaseId);
            return this;
        }

        public Builder setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = Input.of(Objects.requireNonNull(knowledgeBaseId));
            return this;
        }
        public AssistantAssociationAssociationDataArgs build() {
            return new AssistantAssociationAssociationDataArgs(knowledgeBaseId);
        }
    }
}
