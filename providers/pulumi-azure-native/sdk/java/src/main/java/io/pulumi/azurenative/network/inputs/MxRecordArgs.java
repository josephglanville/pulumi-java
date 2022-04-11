// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An MX record.
 * 
 */
public final class MxRecordArgs extends io.pulumi.resources.ResourceArgs {

    public static final MxRecordArgs Empty = new MxRecordArgs();

    /**
     * The domain name of the mail host for this MX record.
     * 
     */
    @Import(name="exchange")
      private final @Nullable Output<String> exchange;

    public Output<String> getExchange() {
        return this.exchange == null ? Codegen.empty() : this.exchange;
    }

    /**
     * The preference value for this MX record.
     * 
     */
    @Import(name="preference")
      private final @Nullable Output<Integer> preference;

    public Output<Integer> getPreference() {
        return this.preference == null ? Codegen.empty() : this.preference;
    }

    public MxRecordArgs(
        @Nullable Output<String> exchange,
        @Nullable Output<Integer> preference) {
        this.exchange = exchange;
        this.preference = preference;
    }

    private MxRecordArgs() {
        this.exchange = Codegen.empty();
        this.preference = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MxRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> exchange;
        private @Nullable Output<Integer> preference;

        public Builder() {
    	      // Empty
        }

        public Builder(MxRecordArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exchange = defaults.exchange;
    	      this.preference = defaults.preference;
        }

        public Builder exchange(@Nullable Output<String> exchange) {
            this.exchange = exchange;
            return this;
        }
        public Builder exchange(@Nullable String exchange) {
            this.exchange = Codegen.ofNullable(exchange);
            return this;
        }
        public Builder preference(@Nullable Output<Integer> preference) {
            this.preference = preference;
            return this;
        }
        public Builder preference(@Nullable Integer preference) {
            this.preference = Codegen.ofNullable(preference);
            return this;
        }        public MxRecordArgs build() {
            return new MxRecordArgs(exchange, preference);
        }
    }
}
