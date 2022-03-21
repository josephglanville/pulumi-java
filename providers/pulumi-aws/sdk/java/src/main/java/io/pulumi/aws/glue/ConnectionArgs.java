// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.aws.glue.inputs.ConnectionPhysicalConnectionRequirementsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

    /**
     * The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
     * 
     */
    @Import(name="catalogId")
      private final @Nullable Output<String> catalogId;

    public Output<String> getCatalogId() {
        return this.catalogId == null ? Output.empty() : this.catalogId;
    }

    /**
     * A map of key-value pairs used as parameters for this connection.
     * 
     */
    @Import(name="connectionProperties")
      private final @Nullable Output<Map<String,String>> connectionProperties;

    public Output<Map<String,String>> getConnectionProperties() {
        return this.connectionProperties == null ? Output.empty() : this.connectionProperties;
    }

    /**
     * The type of the connection. Supported are: `JDBC`, `MONGODB`, `KAFKA`, and `NETWORK`. Defaults to `JBDC`.
     * 
     */
    @Import(name="connectionType")
      private final @Nullable Output<String> connectionType;

    public Output<String> getConnectionType() {
        return this.connectionType == null ? Output.empty() : this.connectionType;
    }

    /**
     * Description of the connection.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * A list of criteria that can be used in selecting this connection.
     * 
     */
    @Import(name="matchCriterias")
      private final @Nullable Output<List<String>> matchCriterias;

    public Output<List<String>> getMatchCriterias() {
        return this.matchCriterias == null ? Output.empty() : this.matchCriterias;
    }

    /**
     * The name of the connection.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
     * 
     */
    @Import(name="physicalConnectionRequirements")
      private final @Nullable Output<ConnectionPhysicalConnectionRequirementsArgs> physicalConnectionRequirements;

    public Output<ConnectionPhysicalConnectionRequirementsArgs> getPhysicalConnectionRequirements() {
        return this.physicalConnectionRequirements == null ? Output.empty() : this.physicalConnectionRequirements;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ConnectionArgs(
        @Nullable Output<String> catalogId,
        @Nullable Output<Map<String,String>> connectionProperties,
        @Nullable Output<String> connectionType,
        @Nullable Output<String> description,
        @Nullable Output<List<String>> matchCriterias,
        @Nullable Output<String> name,
        @Nullable Output<ConnectionPhysicalConnectionRequirementsArgs> physicalConnectionRequirements,
        @Nullable Output<Map<String,String>> tags) {
        this.catalogId = catalogId;
        this.connectionProperties = connectionProperties;
        this.connectionType = connectionType;
        this.description = description;
        this.matchCriterias = matchCriterias;
        this.name = name;
        this.physicalConnectionRequirements = physicalConnectionRequirements;
        this.tags = tags;
    }

    private ConnectionArgs() {
        this.catalogId = Output.empty();
        this.connectionProperties = Output.empty();
        this.connectionType = Output.empty();
        this.description = Output.empty();
        this.matchCriterias = Output.empty();
        this.name = Output.empty();
        this.physicalConnectionRequirements = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> catalogId;
        private @Nullable Output<Map<String,String>> connectionProperties;
        private @Nullable Output<String> connectionType;
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> matchCriterias;
        private @Nullable Output<String> name;
        private @Nullable Output<ConnectionPhysicalConnectionRequirementsArgs> physicalConnectionRequirements;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.connectionProperties = defaults.connectionProperties;
    	      this.connectionType = defaults.connectionType;
    	      this.description = defaults.description;
    	      this.matchCriterias = defaults.matchCriterias;
    	      this.name = defaults.name;
    	      this.physicalConnectionRequirements = defaults.physicalConnectionRequirements;
    	      this.tags = defaults.tags;
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
        public Builder matchCriterias(String... matchCriterias) {
            return matchCriterias(List.of(matchCriterias));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder physicalConnectionRequirements(@Nullable Output<ConnectionPhysicalConnectionRequirementsArgs> physicalConnectionRequirements) {
            this.physicalConnectionRequirements = physicalConnectionRequirements;
            return this;
        }
        public Builder physicalConnectionRequirements(@Nullable ConnectionPhysicalConnectionRequirementsArgs physicalConnectionRequirements) {
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
        }        public ConnectionArgs build() {
            return new ConnectionArgs(catalogId, connectionProperties, connectionType, description, matchCriterias, name, physicalConnectionRequirements, tags);
        }
    }
}
