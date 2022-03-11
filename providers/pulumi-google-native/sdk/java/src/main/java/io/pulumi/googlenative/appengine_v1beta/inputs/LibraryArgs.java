// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Third-party Python runtime library that is required by the application.
 * 
 */
public final class LibraryArgs extends io.pulumi.resources.ResourceArgs {

    public static final LibraryArgs Empty = new LibraryArgs();

    /**
     * Name of the library. Example: "django".
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Version of the library to select, or "latest".
     * 
     */
    @InputImport(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public LibraryArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> version) {
        this.name = name;
        this.version = version;
    }

    private LibraryArgs() {
        this.name = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LibraryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(LibraryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }
        public LibraryArgs build() {
            return new LibraryArgs(name, version);
        }
    }
}
