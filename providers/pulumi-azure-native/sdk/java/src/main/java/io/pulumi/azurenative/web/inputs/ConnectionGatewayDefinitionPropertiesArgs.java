// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.ConnectionGatewayReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionGatewayDefinitionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionGatewayDefinitionPropertiesArgs Empty = new ConnectionGatewayDefinitionPropertiesArgs();

    /**
     * The URI of the backend
     * 
     */
    @InputImport(name="backendUri")
      private final @Nullable Output<String> backendUri;

    public Output<String> getBackendUri() {
        return this.backendUri == null ? Output.empty() : this.backendUri;
    }

    /**
     * The gateway installation reference
     * 
     */
    @InputImport(name="connectionGatewayInstallation")
      private final @Nullable Output<ConnectionGatewayReferenceArgs> connectionGatewayInstallation;

    public Output<ConnectionGatewayReferenceArgs> getConnectionGatewayInstallation() {
        return this.connectionGatewayInstallation == null ? Output.empty() : this.connectionGatewayInstallation;
    }

    /**
     * The gateway admin
     * 
     */
    @InputImport(name="contactInformation")
      private final @Nullable Output<List<String>> contactInformation;

    public Output<List<String>> getContactInformation() {
        return this.contactInformation == null ? Output.empty() : this.contactInformation;
    }

    /**
     * The gateway description
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The gateway display name
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * The machine name of the gateway
     * 
     */
    @InputImport(name="machineName")
      private final @Nullable Output<String> machineName;

    public Output<String> getMachineName() {
        return this.machineName == null ? Output.empty() : this.machineName;
    }

    /**
     * The gateway status
     * 
     */
    @InputImport(name="status")
      private final @Nullable Output<Object> status;

    public Output<Object> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public ConnectionGatewayDefinitionPropertiesArgs(
        @Nullable Output<String> backendUri,
        @Nullable Output<ConnectionGatewayReferenceArgs> connectionGatewayInstallation,
        @Nullable Output<List<String>> contactInformation,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<String> machineName,
        @Nullable Output<Object> status) {
        this.backendUri = backendUri;
        this.connectionGatewayInstallation = connectionGatewayInstallation;
        this.contactInformation = contactInformation;
        this.description = description;
        this.displayName = displayName;
        this.machineName = machineName;
        this.status = status;
    }

    private ConnectionGatewayDefinitionPropertiesArgs() {
        this.backendUri = Output.empty();
        this.connectionGatewayInstallation = Output.empty();
        this.contactInformation = Output.empty();
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.machineName = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionGatewayDefinitionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> backendUri;
        private @Nullable Output<ConnectionGatewayReferenceArgs> connectionGatewayInstallation;
        private @Nullable Output<List<String>> contactInformation;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> machineName;
        private @Nullable Output<Object> status;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionGatewayDefinitionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendUri = defaults.backendUri;
    	      this.connectionGatewayInstallation = defaults.connectionGatewayInstallation;
    	      this.contactInformation = defaults.contactInformation;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.machineName = defaults.machineName;
    	      this.status = defaults.status;
        }

        public Builder backendUri(@Nullable Output<String> backendUri) {
            this.backendUri = backendUri;
            return this;
        }

        public Builder backendUri(@Nullable String backendUri) {
            this.backendUri = Output.ofNullable(backendUri);
            return this;
        }

        public Builder connectionGatewayInstallation(@Nullable Output<ConnectionGatewayReferenceArgs> connectionGatewayInstallation) {
            this.connectionGatewayInstallation = connectionGatewayInstallation;
            return this;
        }

        public Builder connectionGatewayInstallation(@Nullable ConnectionGatewayReferenceArgs connectionGatewayInstallation) {
            this.connectionGatewayInstallation = Output.ofNullable(connectionGatewayInstallation);
            return this;
        }

        public Builder contactInformation(@Nullable Output<List<String>> contactInformation) {
            this.contactInformation = contactInformation;
            return this;
        }

        public Builder contactInformation(@Nullable List<String> contactInformation) {
            this.contactInformation = Output.ofNullable(contactInformation);
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

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder machineName(@Nullable Output<String> machineName) {
            this.machineName = machineName;
            return this;
        }

        public Builder machineName(@Nullable String machineName) {
            this.machineName = Output.ofNullable(machineName);
            return this;
        }

        public Builder status(@Nullable Output<Object> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable Object status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public ConnectionGatewayDefinitionPropertiesArgs build() {
            return new ConnectionGatewayDefinitionPropertiesArgs(backendUri, connectionGatewayInstallation, contactInformation, description, displayName, machineName, status);
        }
    }
}
