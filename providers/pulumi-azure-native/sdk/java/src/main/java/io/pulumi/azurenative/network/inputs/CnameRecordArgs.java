// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A CNAME record.
 * 
 */
public final class CnameRecordArgs extends io.pulumi.resources.ResourceArgs {

    public static final CnameRecordArgs Empty = new CnameRecordArgs();

    /**
     * The canonical name for this CNAME record.
     * 
     */
    @InputImport(name="cname")
      private final @Nullable Input<String> cname;

    public Input<String> getCname() {
        return this.cname == null ? Input.empty() : this.cname;
    }

    public CnameRecordArgs(@Nullable Input<String> cname) {
        this.cname = cname;
    }

    private CnameRecordArgs() {
        this.cname = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CnameRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cname;

        public Builder() {
    	      // Empty
        }

        public Builder(CnameRecordArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cname = defaults.cname;
        }

        public Builder setCname(@Nullable Input<String> cname) {
            this.cname = cname;
            return this;
        }

        public Builder setCname(@Nullable String cname) {
            this.cname = Input.ofNullable(cname);
            return this;
        }
        public CnameRecordArgs build() {
            return new CnameRecordArgs(cname);
        }
    }
}
