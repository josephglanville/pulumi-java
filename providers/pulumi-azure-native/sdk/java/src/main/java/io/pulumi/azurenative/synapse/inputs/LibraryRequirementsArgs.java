// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Library requirements for a Big Data pool powered by Apache Spark
 * 
 */
public final class LibraryRequirementsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LibraryRequirementsArgs Empty = new LibraryRequirementsArgs();

    /**
     * The library requirements.
     * 
     */
    @Import(name="content")
      private final @Nullable Output<String> content;

    public Output<String> getContent() {
        return this.content == null ? Output.empty() : this.content;
    }

    /**
     * The filename of the library requirements file.
     * 
     */
    @Import(name="filename")
      private final @Nullable Output<String> filename;

    public Output<String> getFilename() {
        return this.filename == null ? Output.empty() : this.filename;
    }

    public LibraryRequirementsArgs(
        @Nullable Output<String> content,
        @Nullable Output<String> filename) {
        this.content = content;
        this.filename = filename;
    }

    private LibraryRequirementsArgs() {
        this.content = Output.empty();
        this.filename = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LibraryRequirementsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> content;
        private @Nullable Output<String> filename;

        public Builder() {
    	      // Empty
        }

        public Builder(LibraryRequirementsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.filename = defaults.filename;
        }

        public Builder content(@Nullable Output<String> content) {
            this.content = content;
            return this;
        }
        public Builder content(@Nullable String content) {
            this.content = Output.ofNullable(content);
            return this;
        }
        public Builder filename(@Nullable Output<String> filename) {
            this.filename = filename;
            return this;
        }
        public Builder filename(@Nullable String filename) {
            this.filename = Output.ofNullable(filename);
            return this;
        }        public LibraryRequirementsArgs build() {
            return new LibraryRequirementsArgs(content, filename);
        }
    }
}
