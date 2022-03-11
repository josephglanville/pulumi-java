// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.aws.glue.inputs.ConnectionPhysicalConnectionRequirementsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionState extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionState Empty = new ConnectionState();

    /**
     * The ARN of the Glue Connection.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
     * 
     */
    @InputImport(name="catalogId")
      private final @Nullable Output<String> catalogId;

    public Output<String> getCatalogId() {
        return this.catalogId == null ? Output.empty() : this.catalogId;
    }

    /**
     * A map of key-value pairs used as parameters for this connection.
     * 
     */
    @InputImport(name="connectionProperties")
      private final @Nullable Output<Map<String,String>> connectionProperties;

    public Output<Map<String,String>> getConnectionProperties() {
        return this.connectionProperties == null ? Output.empty() : this.connectionProperties;
    }

    /**
     * The type of the connection. Supported are: `JDBC`, `MONGODB`, `KAFKA`, and `NETWORK`. Defaults to `JBDC`.
     * 
     */
    @InputImport(name="connectionType")
      private final @Nullable Output<String> connectionType;

    public Output<String> getConnectionType() {
        return this.connectionType == null ? Output.empty() : this.connectionType;
    }

    /**
     * Description of the connection.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * A list of criteria that can be used in selecting this connection.
     * 
     */
    @InputImport(name="matchCriterias")
      private final @Nullable Output<List<String>> matchCriterias;

    public Output<List<String>> getMatchCriterias() {
        return this.matchCriterias == null ? Output.empty() : this.matchCriterias;
    }

    /**
     * The name of the connection.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
     * 
     */
    @InputImport(name="physicalConnectionRequirements")
      private final @Nullable Output<ConnectionPhysicalConnectionRequirementsGetArgs> physicalConnectionRequirements;

    public Output<ConnectionPhysicalConnectionRequirementsGetArgs> getPhysicalConnectionRequirements() {
        return this.physicalConnectionRequirements == null ? Output.empty() : this.physicalConnectionRequirements;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public ConnectionState(
        @Nullable Output<String> arn,
        @Nullable Output<String> catalogId,
        @Nullable Output<Map<String,String>> connectionProperties,
        @Nullable Output<String> connectionType,
        @Nullable Output<String> description,
        @Nullable Output<List<String>> matchCriterias,
        @Nullable Output<String> name,
        @Nullable Output<ConnectionPhysicalConnectionRequirementsGetArgs> physicalConnectionRequirements,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.catalogId = catalogId;
        this.connectionProperties = connectionProperties;
        this.connectionType = connectionType;
        this.description = description;
        this.matchCriterias = matchCriterias;
        this.name = name;
        this.physicalConnectionRequirements = physicalConnectionRequirements;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ConnectionState() {
        this.arn = Output.empty();
        this.catalogId = Output.empty();
        this.connectionProperties = Output.empty();
        this.connectionType = Output.empty();
        this.description = Output.empty();
        this.matchCriterias = Output.empty();
        this.name = Output.empty();
        this.physicalConnectionRequirements = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> catalogId;
        private @Nullable Output<Map<String,String>> connectionProperties;
        private @Nullable Output<String> connectionType;
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> matchCriterias;
        private @Nullable Output<String> name;
        private @Nullable Output<ConnectionPhysicalConnectionRequirementsGetArgs> physicalConnectionRequirements;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.catalogId = defaults.catalogId;
    	      this.connectionProperties = defaults.connectionProperties;
    	      this.connectionType = defaults.connectionType;
    	      this.description = defaults.description;
    	      this.matchCriterias = defaults.matchCriterias;
    	      this.name = defaults.name;
    	      this.physicalConnectionRequirements = defaults.physicalConnectionRequirements;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder catalogId(@Nullable Output<String> catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public Builder catalogId(@Nullable String catalogId) {
            this.catalogId = Output.ofNullable(catalogId);
            return this;
        }

        public Builder connectionProperties(@Nullable Output<Map<String,String>> connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }

        public Builder connectionProperties(@Nullable Map<String,String> connectionProperties) {
            this.connectionProperties = Output.ofNullable(connectionProperties);
            return this;
        }

        public Builder connectionType(@Nullable Output<String> connectionType) {
            this.connectionType = connectionType;
            return this;
        }

        public Builder connectionType(@Nullable String connectionType) {
            this.connectionType = Output.ofNullable(connectionType);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder matchCriterias(@Nullable Output<List<String>> matchCriterias) {
            this.matchCriterias = matchCriterias;
            return this;
        }

        public Builder matchCriterias(@Nullable List<String> matchCriterias) {
            this.matchCriterias = Output.ofNullable(matchCriterias);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder physicalConnectionRequirements(@Nullable Output<ConnectionPhysicalConnectionRequirementsGetArgs> physicalConnectionRequirements) {
            this.physicalConnectionRequirements = physicalConnectionRequirements;
            return this;
        }

        public Builder physicalConnectionRequirements(@Nullable ConnectionPhysicalConnectionRequirementsGetArgs physicalConnectionRequirements) {
            this.physicalConnectionRequirements = Output.ofNullable(physicalConnectionRequirements);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public ConnectionState build() {
            return new ConnectionState(arn, catalogId, connectionProperties, connectionType, description, matchCriterias, name, physicalConnectionRequirements, tags, tagsAll);
        }
    }
}
