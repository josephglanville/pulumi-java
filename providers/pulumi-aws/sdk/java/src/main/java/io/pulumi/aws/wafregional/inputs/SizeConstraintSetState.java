// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.inputs;

import io.pulumi.aws.wafregional.inputs.SizeConstraintSetSizeConstraintGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SizeConstraintSetState extends io.pulumi.resources.ResourceArgs {

    public static final SizeConstraintSetState Empty = new SizeConstraintSetState();

    @InputImport(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The name or description of the Size Constraint Set.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Specifies the parts of web requests that you want to inspect the size of.
     * 
     */
    @InputImport(name="sizeConstraints")
      private final @Nullable Output<List<SizeConstraintSetSizeConstraintGetArgs>> sizeConstraints;

    public Output<List<SizeConstraintSetSizeConstraintGetArgs>> getSizeConstraints() {
        return this.sizeConstraints == null ? Output.empty() : this.sizeConstraints;
    }

    public SizeConstraintSetState(
        @Nullable Output<String> arn,
        @Nullable Output<String> name,
        @Nullable Output<List<SizeConstraintSetSizeConstraintGetArgs>> sizeConstraints) {
        this.arn = arn;
        this.name = name;
        this.sizeConstraints = sizeConstraints;
    }

    private SizeConstraintSetState() {
        this.arn = Output.empty();
        this.name = Output.empty();
        this.sizeConstraints = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SizeConstraintSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> name;
        private @Nullable Output<List<SizeConstraintSetSizeConstraintGetArgs>> sizeConstraints;

        public Builder() {
    	      // Empty
        }

        public Builder(SizeConstraintSetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
    	      this.sizeConstraints = defaults.sizeConstraints;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
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

        public Builder sizeConstraints(@Nullable Output<List<SizeConstraintSetSizeConstraintGetArgs>> sizeConstraints) {
            this.sizeConstraints = sizeConstraints;
            return this;
        }

        public Builder sizeConstraints(@Nullable List<SizeConstraintSetSizeConstraintGetArgs> sizeConstraints) {
            this.sizeConstraints = Output.ofNullable(sizeConstraints);
            return this;
        }
        public SizeConstraintSetState build() {
            return new SizeConstraintSetState(arn, name, sizeConstraints);
        }
    }
}
