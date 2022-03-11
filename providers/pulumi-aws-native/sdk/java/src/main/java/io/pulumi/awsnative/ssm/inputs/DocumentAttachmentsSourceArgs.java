// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssm.inputs;

import io.pulumi.awsnative.ssm.enums.DocumentAttachmentsSourceKey;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DocumentAttachmentsSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DocumentAttachmentsSourceArgs Empty = new DocumentAttachmentsSourceArgs();

    /**
     * The key of a key-value pair that identifies the location of an attachment to a document.
     * 
     */
    @InputImport(name="key")
      private final @Nullable Output<DocumentAttachmentsSourceKey> key;

    public Output<DocumentAttachmentsSourceKey> getKey() {
        return this.key == null ? Output.empty() : this.key;
    }

    /**
     * The name of the document attachment file.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The value of a key-value pair that identifies the location of an attachment to a document. The format for Value depends on the type of key you specify.
     * 
     */
    @InputImport(name="values")
      private final @Nullable Output<List<String>> values;

    public Output<List<String>> getValues() {
        return this.values == null ? Output.empty() : this.values;
    }

    public DocumentAttachmentsSourceArgs(
        @Nullable Output<DocumentAttachmentsSourceKey> key,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> values) {
        this.key = key;
        this.name = name;
        this.values = values;
    }

    private DocumentAttachmentsSourceArgs() {
        this.key = Output.empty();
        this.name = Output.empty();
        this.values = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentAttachmentsSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DocumentAttachmentsSourceKey> key;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentAttachmentsSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder key(@Nullable Output<DocumentAttachmentsSourceKey> key) {
            this.key = key;
            return this;
        }

        public Builder key(@Nullable DocumentAttachmentsSourceKey key) {
            this.key = Output.ofNullable(key);
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

        public Builder values(@Nullable Output<List<String>> values) {
            this.values = values;
            return this;
        }

        public Builder values(@Nullable List<String> values) {
            this.values = Output.ofNullable(values);
            return this;
        }
        public DocumentAttachmentsSourceArgs build() {
            return new DocumentAttachmentsSourceArgs(key, name, values);
        }
    }
}
