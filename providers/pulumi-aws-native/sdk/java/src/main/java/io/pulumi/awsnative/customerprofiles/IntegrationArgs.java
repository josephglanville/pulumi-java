// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles;

import io.pulumi.awsnative.customerprofiles.inputs.IntegrationFlowDefinitionArgs;
import io.pulumi.awsnative.customerprofiles.inputs.IntegrationObjectTypeMappingArgs;
import io.pulumi.awsnative.customerprofiles.inputs.IntegrationTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="domainName", required=true)
      private final Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName;
    }

    @Import(name="flowDefinition")
      private final @Nullable Output<IntegrationFlowDefinitionArgs> flowDefinition;

    public Output<IntegrationFlowDefinitionArgs> getFlowDefinition() {
        return this.flowDefinition == null ? Output.empty() : this.flowDefinition;
    }

    /**
     * The name of the ObjectType defined for the 3rd party data in Profile Service
     * 
     */
    @Import(name="objectTypeName")
      private final @Nullable Output<String> objectTypeName;

    public Output<String> getObjectTypeName() {
        return this.objectTypeName == null ? Output.empty() : this.objectTypeName;
    }

    /**
     * The mapping between 3rd party event types and ObjectType names
     * 
     */
    @Import(name="objectTypeNames")
      private final @Nullable Output<List<IntegrationObjectTypeMappingArgs>> objectTypeNames;

    public Output<List<IntegrationObjectTypeMappingArgs>> getObjectTypeNames() {
        return this.objectTypeNames == null ? Output.empty() : this.objectTypeNames;
    }

    /**
     * The tags (keys and values) associated with the integration
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<IntegrationTagArgs>> tags;

    public Output<List<IntegrationTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The URI of the S3 bucket or any other type of data source.
     * 
     */
    @Import(name="uri")
      private final @Nullable Output<String> uri;

    public Output<String> getUri() {
        return this.uri == null ? Output.empty() : this.uri;
    }

    public IntegrationArgs(
        Output<String> domainName,
        @Nullable Output<IntegrationFlowDefinitionArgs> flowDefinition,
        @Nullable Output<String> objectTypeName,
        @Nullable Output<List<IntegrationObjectTypeMappingArgs>> objectTypeNames,
        @Nullable Output<List<IntegrationTagArgs>> tags,
        @Nullable Output<String> uri) {
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.flowDefinition = flowDefinition;
        this.objectTypeName = objectTypeName;
        this.objectTypeNames = objectTypeNames;
        this.tags = tags;
        this.uri = uri;
    }

    private IntegrationArgs() {
        this.domainName = Output.empty();
        this.flowDefinition = Output.empty();
        this.objectTypeName = Output.empty();
        this.objectTypeNames = Output.empty();
        this.tags = Output.empty();
        this.uri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> domainName;
        private @Nullable Output<IntegrationFlowDefinitionArgs> flowDefinition;
        private @Nullable Output<String> objectTypeName;
        private @Nullable Output<List<IntegrationObjectTypeMappingArgs>> objectTypeNames;
        private @Nullable Output<List<IntegrationTagArgs>> tags;
        private @Nullable Output<String> uri;

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

        public Builder domainName(Output<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder domainName(String domainName) {
            this.domainName = Output.of(Objects.requireNonNull(domainName));
            return this;
        }
        public Builder flowDefinition(@Nullable Output<IntegrationFlowDefinitionArgs> flowDefinition) {
            this.flowDefinition = flowDefinition;
            return this;
        }
        public Builder flowDefinition(@Nullable IntegrationFlowDefinitionArgs flowDefinition) {
            this.flowDefinition = Output.ofNullable(flowDefinition);
            return this;
        }
        public Builder objectTypeName(@Nullable Output<String> objectTypeName) {
            this.objectTypeName = objectTypeName;
            return this;
        }
        public Builder objectTypeName(@Nullable String objectTypeName) {
            this.objectTypeName = Output.ofNullable(objectTypeName);
            return this;
        }
        public Builder objectTypeNames(@Nullable Output<List<IntegrationObjectTypeMappingArgs>> objectTypeNames) {
            this.objectTypeNames = objectTypeNames;
            return this;
        }
        public Builder objectTypeNames(@Nullable List<IntegrationObjectTypeMappingArgs> objectTypeNames) {
            this.objectTypeNames = Output.ofNullable(objectTypeNames);
            return this;
        }
        public Builder objectTypeNames(IntegrationObjectTypeMappingArgs... objectTypeNames) {
            return objectTypeNames(List.of(objectTypeNames));
        }
        public Builder tags(@Nullable Output<List<IntegrationTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<IntegrationTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(IntegrationTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder uri(@Nullable Output<String> uri) {
            this.uri = uri;
            return this;
        }
        public Builder uri(@Nullable String uri) {
            this.uri = Output.ofNullable(uri);
            return this;
        }        public IntegrationArgs build() {
            return new IntegrationArgs(domainName, flowDefinition, objectTypeName, objectTypeNames, tags, uri);
        }
    }
}
