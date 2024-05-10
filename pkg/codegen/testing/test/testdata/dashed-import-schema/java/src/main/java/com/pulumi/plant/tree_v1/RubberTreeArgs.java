// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.plant.tree_v1;

import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.plant.inputs.ContainerArgs;
import com.pulumi.plant.tree_v1.enums.Diameter;
import com.pulumi.plant.tree_v1.enums.Farm;
import com.pulumi.plant.tree_v1.enums.RubberTreeVariety;
import com.pulumi.plant.tree_v1.enums.TreeSize;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RubberTreeArgs extends com.pulumi.resources.ResourceArgs {

    public static final RubberTreeArgs Empty = new RubberTreeArgs();

    @Import(name="container")
    private @Nullable Output<ContainerArgs> container;

    public Optional<Output<ContainerArgs>> container() {
        return Optional.ofNullable(this.container);
    }

    @Import(name="diameter", required=true)
    private Output<Diameter> diameter;

    public Output<Diameter> diameter() {
        return this.diameter;
    }

    @Import(name="farm")
    private @Nullable Output<Either<Farm,String>> farm;

    public Optional<Output<Either<Farm,String>>> farm() {
        return Optional.ofNullable(this.farm);
    }

    @Import(name="size")
    private @Nullable Output<TreeSize> size;

    public Optional<Output<TreeSize>> size() {
        return Optional.ofNullable(this.size);
    }

    @Import(name="type", required=true)
    private Output<RubberTreeVariety> type;

    public Output<RubberTreeVariety> type() {
        return this.type;
    }

    private RubberTreeArgs() {}

    private RubberTreeArgs(RubberTreeArgs $) {
        this.container = $.container;
        this.diameter = $.diameter;
        this.farm = $.farm;
        this.size = $.size;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RubberTreeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RubberTreeArgs $;

        public Builder() {
            $ = new RubberTreeArgs();
        }

        public Builder(RubberTreeArgs defaults) {
            $ = new RubberTreeArgs(Objects.requireNonNull(defaults));
        }

        public Builder container(@Nullable Output<ContainerArgs> container) {
            $.container = container;
            return this;
        }

        public Builder container(ContainerArgs container) {
            return container(Output.of(container));
        }

        public Builder diameter(Output<Diameter> diameter) {
            $.diameter = diameter;
            return this;
        }

        public Builder diameter(Diameter diameter) {
            return diameter(Output.of(diameter));
        }

        public Builder farm(@Nullable Output<Either<Farm,String>> farm) {
            $.farm = farm;
            return this;
        }

        public Builder farm(Either<Farm,String> farm) {
            return farm(Output.of(farm));
        }

        public Builder farm(Farm farm) {
            return farm(Either.ofLeft(farm));
        }

        public Builder farm(String farm) {
            return farm(Either.ofRight(farm));
        }

        public Builder size(@Nullable Output<TreeSize> size) {
            $.size = size;
            return this;
        }

        public Builder size(TreeSize size) {
            return size(Output.of(size));
        }

        public Builder type(Output<RubberTreeVariety> type) {
            $.type = type;
            return this;
        }

        public Builder type(RubberTreeVariety type) {
            return type(Output.of(type));
        }

        public RubberTreeArgs build() {
            $.diameter = Codegen.objectProp("diameter", Diameter.class).output().arg($.diameter).def(Diameter.Sixinch).require();
            $.farm = Codegen.stringProp("farm").right(Farm.class).output().arg($.farm).def("(unknown)").getNullable();
            $.size = Codegen.objectProp("size", TreeSize.class).output().arg($.size).def(TreeSize.Medium).getNullable();
            $.type = Codegen.objectProp("type", RubberTreeVariety.class).output().arg($.type).def(RubberTreeVariety.Burgundy).require();
            return $;
        }
    }

}
