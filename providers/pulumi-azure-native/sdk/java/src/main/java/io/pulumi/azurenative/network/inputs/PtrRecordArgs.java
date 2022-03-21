// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A PTR record.
 * 
 */
public final class PtrRecordArgs extends io.pulumi.resources.ResourceArgs {

    public static final PtrRecordArgs Empty = new PtrRecordArgs();

    /**
     * The PTR target domain name for this PTR record.
     * 
     */
    @Import(name="ptrdname")
      private final @Nullable Output<String> ptrdname;

    public Output<String> getPtrdname() {
        return this.ptrdname == null ? Output.empty() : this.ptrdname;
    }

    public PtrRecordArgs(@Nullable Output<String> ptrdname) {
        this.ptrdname = ptrdname;
    }

    private PtrRecordArgs() {
        this.ptrdname = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PtrRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ptrdname;

        public Builder() {
    	      // Empty
        }

        public Builder(PtrRecordArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ptrdname = defaults.ptrdname;
        }

        public Builder ptrdname(@Nullable Output<String> ptrdname) {
            this.ptrdname = ptrdname;
            return this;
        }
        public Builder ptrdname(@Nullable String ptrdname) {
            this.ptrdname = Output.ofNullable(ptrdname);
            return this;
        }        public PtrRecordArgs build() {
            return new PtrRecordArgs(ptrdname);
        }
    }
}
