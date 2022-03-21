// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.VersionSourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Root config message for HL7v2 schema. This contains a schema structure of groups and segments, and filters that determine which messages to apply the schema structure to.
 * 
 */
public final class Hl7SchemaConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final Hl7SchemaConfigArgs Empty = new Hl7SchemaConfigArgs();

    /**
     * Map from each HL7v2 message type and trigger event pair, such as ADT_A04, to its schema configuration root group.
     * 
     */
    @Import(name="messageSchemaConfigs")
      private final @Nullable Output<Map<String,String>> messageSchemaConfigs;

    public Output<Map<String,String>> getMessageSchemaConfigs() {
        return this.messageSchemaConfigs == null ? Output.empty() : this.messageSchemaConfigs;
    }

    /**
     * Each VersionSource is tested and only if they all match is the schema used for the message.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<List<VersionSourceArgs>> version;

    public Output<List<VersionSourceArgs>> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public Hl7SchemaConfigArgs(
        @Nullable Output<Map<String,String>> messageSchemaConfigs,
        @Nullable Output<List<VersionSourceArgs>> version) {
        this.messageSchemaConfigs = messageSchemaConfigs;
        this.version = version;
    }

    private Hl7SchemaConfigArgs() {
        this.messageSchemaConfigs = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7SchemaConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> messageSchemaConfigs;
        private @Nullable Output<List<VersionSourceArgs>> version;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7SchemaConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageSchemaConfigs = defaults.messageSchemaConfigs;
    	      this.version = defaults.version;
        }

        public Builder messageSchemaConfigs(@Nullable Output<Map<String,String>> messageSchemaConfigs) {
            this.messageSchemaConfigs = messageSchemaConfigs;
            return this;
        }
        public Builder messageSchemaConfigs(@Nullable Map<String,String> messageSchemaConfigs) {
            this.messageSchemaConfigs = Output.ofNullable(messageSchemaConfigs);
            return this;
        }
        public Builder version(@Nullable Output<List<VersionSourceArgs>> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable List<VersionSourceArgs> version) {
            this.version = Output.ofNullable(version);
            return this;
        }
        public Builder version(VersionSourceArgs... version) {
            return version(List.of(version));
        }        public Hl7SchemaConfigArgs build() {
            return new Hl7SchemaConfigArgs(messageSchemaConfigs, version);
        }
    }
}
