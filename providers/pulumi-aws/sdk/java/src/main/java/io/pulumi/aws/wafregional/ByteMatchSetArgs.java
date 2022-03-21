// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional;

import io.pulumi.aws.wafregional.inputs.ByteMatchSetByteMatchTupleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ByteMatchSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ByteMatchSetArgs Empty = new ByteMatchSetArgs();

    /**
     * Settings for the ByteMatchSet, such as the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests. ByteMatchTuple documented below.
     * 
     */
    @Import(name="byteMatchTuples")
      private final @Nullable Output<List<ByteMatchSetByteMatchTupleArgs>> byteMatchTuples;

    public Output<List<ByteMatchSetByteMatchTupleArgs>> getByteMatchTuples() {
        return this.byteMatchTuples == null ? Output.empty() : this.byteMatchTuples;
    }

    /**
     * The name or description of the ByteMatchSet.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public ByteMatchSetArgs(
        @Nullable Output<List<ByteMatchSetByteMatchTupleArgs>> byteMatchTuples,
        @Nullable Output<String> name) {
        this.byteMatchTuples = byteMatchTuples;
        this.name = name;
    }

    private ByteMatchSetArgs() {
        this.byteMatchTuples = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ByteMatchSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ByteMatchSetByteMatchTupleArgs>> byteMatchTuples;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ByteMatchSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.byteMatchTuples = defaults.byteMatchTuples;
    	      this.name = defaults.name;
        }

        public Builder byteMatchTuples(@Nullable Output<List<ByteMatchSetByteMatchTupleArgs>> byteMatchTuples) {
            this.byteMatchTuples = byteMatchTuples;
            return this;
        }
        public Builder byteMatchTuples(@Nullable List<ByteMatchSetByteMatchTupleArgs> byteMatchTuples) {
            this.byteMatchTuples = Output.ofNullable(byteMatchTuples);
            return this;
        }
        public Builder byteMatchTuples(ByteMatchSetByteMatchTupleArgs... byteMatchTuples) {
            return byteMatchTuples(List.of(byteMatchTuples));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public ByteMatchSetArgs build() {
            return new ByteMatchSetArgs(byteMatchTuples, name);
        }
    }
}
