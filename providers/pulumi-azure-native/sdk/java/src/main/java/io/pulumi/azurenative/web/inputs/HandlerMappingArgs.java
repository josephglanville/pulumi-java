// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The IIS handler mappings used to define which handler processes HTTP requests with certain extension.
 * For example, it is used to configure php-cgi.exe process to handle all HTTP requests with *.php extension.
 * 
 */
public final class HandlerMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final HandlerMappingArgs Empty = new HandlerMappingArgs();

    /**
     * Command-line arguments to be passed to the script processor.
     * 
     */
    @InputImport(name="arguments")
      private final @Nullable Input<String> arguments;

    public Input<String> getArguments() {
        return this.arguments == null ? Input.empty() : this.arguments;
    }

    /**
     * Requests with this extension will be handled using the specified FastCGI application.
     * 
     */
    @InputImport(name="extension")
      private final @Nullable Input<String> extension;

    public Input<String> getExtension() {
        return this.extension == null ? Input.empty() : this.extension;
    }

    /**
     * The absolute path to the FastCGI application.
     * 
     */
    @InputImport(name="scriptProcessor")
      private final @Nullable Input<String> scriptProcessor;

    public Input<String> getScriptProcessor() {
        return this.scriptProcessor == null ? Input.empty() : this.scriptProcessor;
    }

    public HandlerMappingArgs(
        @Nullable Input<String> arguments,
        @Nullable Input<String> extension,
        @Nullable Input<String> scriptProcessor) {
        this.arguments = arguments;
        this.extension = extension;
        this.scriptProcessor = scriptProcessor;
    }

    private HandlerMappingArgs() {
        this.arguments = Input.empty();
        this.extension = Input.empty();
        this.scriptProcessor = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HandlerMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arguments;
        private @Nullable Input<String> extension;
        private @Nullable Input<String> scriptProcessor;

        public Builder() {
    	      // Empty
        }

        public Builder(HandlerMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.extension = defaults.extension;
    	      this.scriptProcessor = defaults.scriptProcessor;
        }

        public Builder setArguments(@Nullable Input<String> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder setArguments(@Nullable String arguments) {
            this.arguments = Input.ofNullable(arguments);
            return this;
        }

        public Builder setExtension(@Nullable Input<String> extension) {
            this.extension = extension;
            return this;
        }

        public Builder setExtension(@Nullable String extension) {
            this.extension = Input.ofNullable(extension);
            return this;
        }

        public Builder setScriptProcessor(@Nullable Input<String> scriptProcessor) {
            this.scriptProcessor = scriptProcessor;
            return this;
        }

        public Builder setScriptProcessor(@Nullable String scriptProcessor) {
            this.scriptProcessor = Input.ofNullable(scriptProcessor);
            return this;
        }
        public HandlerMappingArgs build() {
            return new HandlerMappingArgs(arguments, extension, scriptProcessor);
        }
    }
}
