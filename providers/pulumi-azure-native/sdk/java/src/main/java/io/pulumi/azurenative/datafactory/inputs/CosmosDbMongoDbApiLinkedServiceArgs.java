// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Linked service for CosmosDB (MongoDB API) data source.
 * 
 */
public final class CosmosDbMongoDbApiLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CosmosDbMongoDbApiLinkedServiceArgs Empty = new CosmosDbMongoDbApiLinkedServiceArgs();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> getAnnotations() {
        return this.annotations == null ? Codegen.empty() : this.annotations;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Output<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Codegen.empty() : this.connectVia;
    }

    /**
     * The CosmosDB (MongoDB API) connection string. Type: string, SecureString or AzureKeyVaultSecretReference. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="connectionString", required=true)
      private final Output<Object> connectionString;

    public Output<Object> getConnectionString() {
        return this.connectionString;
    }

    /**
     * The name of the CosmosDB (MongoDB API) database that you want to access. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="database", required=true)
      private final Output<Object> database;

    public Output<Object> getDatabase() {
        return this.database;
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Whether the CosmosDB (MongoDB API) server version is higher than 3.2. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="isServerVersionAbove32")
      private final @Nullable Output<Object> isServerVersionAbove32;

    public Output<Object> getIsServerVersionAbove32() {
        return this.isServerVersionAbove32 == null ? Codegen.empty() : this.isServerVersionAbove32;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Output<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * Type of linked service.
     * Expected value is 'CosmosDbMongoDbApi'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public CosmosDbMongoDbApiLinkedServiceArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        Output<Object> connectionString,
        Output<Object> database,
        @Nullable Output<String> description,
        @Nullable Output<Object> isServerVersionAbove32,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        Output<String> type) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.connectionString = Objects.requireNonNull(connectionString, "expected parameter 'connectionString' to be non-null");
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.description = description;
        this.isServerVersionAbove32 = isServerVersionAbove32;
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private CosmosDbMongoDbApiLinkedServiceArgs() {
        this.annotations = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.connectionString = Codegen.empty();
        this.database = Codegen.empty();
        this.description = Codegen.empty();
        this.isServerVersionAbove32 = Codegen.empty();
        this.parameters = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CosmosDbMongoDbApiLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private Output<Object> connectionString;
        private Output<Object> database;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> isServerVersionAbove32;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(CosmosDbMongoDbApiLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionString = defaults.connectionString;
    	      this.database = defaults.database;
    	      this.description = defaults.description;
    	      this.isServerVersionAbove32 = defaults.isServerVersionAbove32;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Codegen.ofNullable(annotations);
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Codegen.ofNullable(connectVia);
            return this;
        }
        public Builder connectionString(Output<Object> connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }
        public Builder connectionString(Object connectionString) {
            this.connectionString = Output.of(Objects.requireNonNull(connectionString));
            return this;
        }
        public Builder database(Output<Object> database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder database(Object database) {
            this.database = Output.of(Objects.requireNonNull(database));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder isServerVersionAbove32(@Nullable Output<Object> isServerVersionAbove32) {
            this.isServerVersionAbove32 = isServerVersionAbove32;
            return this;
        }
        public Builder isServerVersionAbove32(@Nullable Object isServerVersionAbove32) {
            this.isServerVersionAbove32 = Codegen.ofNullable(isServerVersionAbove32);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public CosmosDbMongoDbApiLinkedServiceArgs build() {
            return new CosmosDbMongoDbApiLinkedServiceArgs(annotations, connectVia, connectionString, database, description, isServerVersionAbove32, parameters, type);
        }
    }
}
