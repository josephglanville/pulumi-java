// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles;

import io.pulumi.awsnative.customerprofiles.inputs.IntegrationFlowDefinitionArgs;
import io.pulumi.awsnative.customerprofiles.inputs.IntegrationObjectTypeMappingArgs;
import io.pulumi.awsnative.customerprofiles.inputs.IntegrationTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationArgs Empty = new IntegrationArgs();

    /**
     * The unique name of the domain.
     * 
     */
    @InputImport(name="domainName", required=true)
      private final Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName;
    }

    @InputImport(name="flowDefinition")
      private final @Nullable Input<IntegrationFlowDefinitionArgs> flowDefinition;

    public Input<IntegrationFlowDefinitionArgs> getFlowDefinition() {
        return this.flowDefinition == null ? Input.empty() : this.flowDefinition;
    }

    /**
     * The name of the ObjectType defined for the 3rd party data in Profile Service
     * 
     */
    @InputImport(name="objectTypeName")
      private final @Nullable Input<String> objectTypeName;

    public Input<String> getObjectTypeName() {
        return this.objectTypeName == null ? Input.empty() : this.objectTypeName;
    }

    /**
     * The mapping between 3rd party event types and ObjectType names
     * 
     */
    @InputImport(name="objectTypeNames")
      private final @Nullable Input<List<IntegrationObjectTypeMappingArgs>> objectTypeNames;

    public Input<List<IntegrationObjectTypeMappingArgs>> getObjectTypeNames() {
        return this.objectTypeNames == null ? Input.empty() : this.objectTypeNames;
    }

    /**
     * The tags (keys and values) associated with the integration
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<IntegrationTagArgs>> tags;

    public Input<List<IntegrationTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The URI of the S3 bucket or any other type of data source.
     * 
     */
    @InputImport(name="uri")
      private final @Nullable Input<String> uri;

    public Input<String> getUri() {
        return this.uri == null ? Input.empty() : this.uri;
    }

    public IntegrationArgs(
        Input<String> domainName,
        @Nullable Input<IntegrationFlowDefinitionArgs> flowDefinition,
        @Nullable Input<String> objectTypeName,
        @Nullable Input<List<IntegrationObjectTypeMappingArgs>> objectTypeNames,
        @Nullable Input<List<IntegrationTagArgs>> tags,
        @Nullable Input<String> uri) {
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.flowDefinition = flowDefinition;
        this.objectTypeName = objectTypeName;
        this.objectTypeNames = objectTypeNames;
        this.tags = tags;
        this.uri = uri;
    }

    private IntegrationArgs() {
        this.domainName = Input.empty();
        this.flowDefinition = Input.empty();
        this.objectTypeName = Input.empty();
        this.objectTypeNames = Input.empty();
        this.tags = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> domainName;
        private @Nullable Input<IntegrationFlowDefinitionArgs> flowDefinition;
        private @Nullable Input<String> objectTypeName;
        private @Nullable Input<List<IntegrationObjectTypeMappingArgs>> objectTypeNames;
        private @Nullable Input<List<IntegrationTagArgs>> tags;
        private @Nullable Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.flowDefinition = defaults.flowDefinition;
    	      this.objectTypeName = defaults.objectTypeName;
    	      this.objectTypeNames = defaults.objectTypeNames;
    	      this.tags = defaults.tags;
    	      this.uri = defaults.uri;
        }

        public Builder setDomainName(Input<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Input.of(Objects.requireNonNull(domainName));
            return this;
        }

        public Builder setFlowDefinition(@Nullable Input<IntegrationFlowDefinitionArgs> flowDefinition) {
            this.flowDefinition = flowDefinition;
            return this;
        }

        public Builder setFlowDefinition(@Nullable IntegrationFlowDefinitionArgs flowDefinition) {
            this.flowDefinition = Input.ofNullable(flowDefinition);
            return this;
        }

        public Builder setObjectTypeName(@Nullable Input<String> objectTypeName) {
            this.objectTypeName = objectTypeName;
            return this;
        }

        public Builder setObjectTypeName(@Nullable String objectTypeName) {
            this.objectTypeName = Input.ofNullable(objectTypeName);
            return this;
        }

        public Builder setObjectTypeNames(@Nullable Input<List<IntegrationObjectTypeMappingArgs>> objectTypeNames) {
            this.objectTypeNames = objectTypeNames;
            return this;
        }

        public Builder setObjectTypeNames(@Nullable List<IntegrationObjectTypeMappingArgs> objectTypeNames) {
            this.objectTypeNames = Input.ofNullable(objectTypeNames);
            return this;
        }

        public Builder setTags(@Nullable Input<List<IntegrationTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<IntegrationTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUri(@Nullable Input<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = Input.ofNullable(uri);
            return this;
        }
        public IntegrationArgs build() {
            return new IntegrationArgs(domainName, flowDefinition, objectTypeName, objectTypeNames, tags, uri);
        }
    }
}
