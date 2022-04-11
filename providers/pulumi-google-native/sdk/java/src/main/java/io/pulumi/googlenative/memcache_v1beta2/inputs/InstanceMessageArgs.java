// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.memcache_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.memcache_v1beta2.enums.InstanceMessageCode;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceMessageArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceMessageArgs Empty = new InstanceMessageArgs();

    /**
     * A code that correspond to one type of user-facing message.
     * 
     */
    @Import(name="code")
      private final @Nullable Output<InstanceMessageCode> code;

    public Output<InstanceMessageCode> getCode() {
        return this.code == null ? Codegen.empty() : this.code;
    }

    /**
     * Message on memcached instance which will be exposed to users.
     * 
     */
    @Import(name="message")
      private final @Nullable Output<String> message;

    public Output<String> getMessage() {
        return this.message == null ? Codegen.empty() : this.message;
    }

    public InstanceMessageArgs(
        @Nullable Output<InstanceMessageCode> code,
        @Nullable Output<String> message) {
        this.code = code;
        this.message = message;
    }

    private InstanceMessageArgs() {
        this.code = Codegen.empty();
        this.message = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InstanceMessageCode> code;
        private @Nullable Output<String> message;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceMessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        public Builder code(@Nullable Output<InstanceMessageCode> code) {
            this.code = code;
            return this;
        }
        public Builder code(@Nullable InstanceMessageCode code) {
            this.code = Codegen.ofNullable(code);
            return this;
        }
        public Builder message(@Nullable Output<String> message) {
            this.message = message;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = Codegen.ofNullable(message);
            return this;
        }        public InstanceMessageArgs build() {
            return new InstanceMessageArgs(code, message);
        }
    }
}
