// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CatalogTableStorageDescriptorSerDeInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final CatalogTableStorageDescriptorSerDeInfoArgs Empty = new CatalogTableStorageDescriptorSerDeInfoArgs();

    /**
     * Name of the target table.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Map of initialization parameters for the SerDe, in key-value form.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Output<Map<String,String>> parameters;

    public Output<Map<String,String>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * Usually the class that implements the SerDe. An example is `org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe`.
     * 
     */
    @InputImport(name="serializationLibrary")
      private final @Nullable Output<String> serializationLibrary;

    public Output<String> getSerializationLibrary() {
        return this.serializationLibrary == null ? Output.empty() : this.serializationLibrary;
    }

    public CatalogTableStorageDescriptorSerDeInfoArgs(
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> parameters,
        @Nullable Output<String> serializationLibrary) {
        this.name = name;
        this.parameters = parameters;
        this.serializationLibrary = serializationLibrary;
    }

    private CatalogTableStorageDescriptorSerDeInfoArgs() {
        this.name = Output.empty();
        this.parameters = Output.empty();
        this.serializationLibrary = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogTableStorageDescriptorSerDeInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> parameters;
        private @Nullable Output<String> serializationLibrary;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogTableStorageDescriptorSerDeInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.serializationLibrary = defaults.serializationLibrary;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }

        public Builder serializationLibrary(@Nullable Output<String> serializationLibrary) {
            this.serializationLibrary = serializationLibrary;
            return this;
        }

        public Builder serializationLibrary(@Nullable String serializationLibrary) {
            this.serializationLibrary = Output.ofNullable(serializationLibrary);
            return this;
        }
        public CatalogTableStorageDescriptorSerDeInfoArgs build() {
            return new CatalogTableStorageDescriptorSerDeInfoArgs(name, parameters, serializationLibrary);
        }
    }
}
