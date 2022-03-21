// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.fms.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An FMS includeMap or excludeMap.
 * 
 */
public final class PolicyIEMapArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyIEMapArgs Empty = new PolicyIEMapArgs();

    @Import(name="aCCOUNT")
      private final @Nullable Output<List<String>> aCCOUNT;

    public Output<List<String>> getACCOUNT() {
        return this.aCCOUNT == null ? Output.empty() : this.aCCOUNT;
    }

    @Import(name="oRGUNIT")
      private final @Nullable Output<List<String>> oRGUNIT;

    public Output<List<String>> getORGUNIT() {
        return this.oRGUNIT == null ? Output.empty() : this.oRGUNIT;
    }

    public PolicyIEMapArgs(
        @Nullable Output<List<String>> aCCOUNT,
        @Nullable Output<List<String>> oRGUNIT) {
        this.aCCOUNT = aCCOUNT;
        this.oRGUNIT = oRGUNIT;
    }

    private PolicyIEMapArgs() {
        this.aCCOUNT = Output.empty();
        this.oRGUNIT = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyIEMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> aCCOUNT;
        private @Nullable Output<List<String>> oRGUNIT;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyIEMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aCCOUNT = defaults.aCCOUNT;
    	      this.oRGUNIT = defaults.oRGUNIT;
        }

        public Builder aCCOUNT(@Nullable Output<List<String>> aCCOUNT) {
            this.aCCOUNT = aCCOUNT;
            return this;
        }
        public Builder aCCOUNT(@Nullable List<String> aCCOUNT) {
            this.aCCOUNT = Output.ofNullable(aCCOUNT);
            return this;
        }
        public Builder aCCOUNT(String... aCCOUNT) {
            return aCCOUNT(List.of(aCCOUNT));
        }
        public Builder oRGUNIT(@Nullable Output<List<String>> oRGUNIT) {
            this.oRGUNIT = oRGUNIT;
            return this;
        }
        public Builder oRGUNIT(@Nullable List<String> oRGUNIT) {
            this.oRGUNIT = Output.ofNullable(oRGUNIT);
            return this;
        }
        public Builder oRGUNIT(String... oRGUNIT) {
            return oRGUNIT(List.of(oRGUNIT));
        }        public PolicyIEMapArgs build() {
            return new PolicyIEMapArgs(aCCOUNT, oRGUNIT);
        }
    }
}
