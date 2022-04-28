// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.foobar;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.foobar.enums.EnumThing;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModuleResourceArgs extends ResourceArgs {

    public static final ModuleResourceArgs Empty = new ModuleResourceArgs();

    @Import(name="optional_bool")
    private @Nullable Output<Boolean> optional_bool;

    public Optional<Output<Boolean>> optional_bool() {
        return Optional.ofNullable(this.optional_bool);
    }

    @Import(name="optional_const")
    private @Nullable Output<String> optional_const;

    public Optional<Output<String>> optional_const() {
        return Optional.ofNullable(this.optional_const);
    }

    @Import(name="optional_enum")
    private @Nullable Output<EnumThing> optional_enum;

    public Optional<Output<EnumThing>> optional_enum() {
        return Optional.ofNullable(this.optional_enum);
    }

    @Import(name="optional_number")
    private @Nullable Output<Double> optional_number;

    public Optional<Output<Double>> optional_number() {
        return Optional.ofNullable(this.optional_number);
    }

    @Import(name="optional_string")
    private @Nullable Output<String> optional_string;

    public Optional<Output<String>> optional_string() {
        return Optional.ofNullable(this.optional_string);
    }

    @Import(name="plain_optional_bool")
    private @Nullable Boolean plain_optional_bool;

    public Optional<Boolean> plain_optional_bool() {
        return Optional.ofNullable(this.plain_optional_bool);
    }

    @Import(name="plain_optional_const")
    private @Nullable String plain_optional_const;

    public Optional<String> plain_optional_const() {
        return Optional.ofNullable(this.plain_optional_const);
    }

    @Import(name="plain_optional_number")
    private @Nullable Double plain_optional_number;

    public Optional<Double> plain_optional_number() {
        return Optional.ofNullable(this.plain_optional_number);
    }

    @Import(name="plain_optional_string")
    private @Nullable String plain_optional_string;

    public Optional<String> plain_optional_string() {
        return Optional.ofNullable(this.plain_optional_string);
    }

    @Import(name="plain_required_bool", required=true)
    private Boolean plain_required_bool;

    public Boolean plain_required_bool() {
        return this.plain_required_bool;
    }

    @Import(name="plain_required_const", required=true)
    private String plain_required_const;

    public String plain_required_const() {
        return this.plain_required_const;
    }

    @Import(name="plain_required_number", required=true)
    private Double plain_required_number;

    public Double plain_required_number() {
        return this.plain_required_number;
    }

    @Import(name="plain_required_string", required=true)
    private String plain_required_string;

    public String plain_required_string() {
        return this.plain_required_string;
    }

    @Import(name="required_bool", required=true)
    private Output<Boolean> required_bool;

    public Output<Boolean> required_bool() {
        return this.required_bool;
    }

    @Import(name="required_enum", required=true)
    private Output<EnumThing> required_enum;

    public Output<EnumThing> required_enum() {
        return this.required_enum;
    }

    @Import(name="required_number", required=true)
    private Output<Double> required_number;

    public Output<Double> required_number() {
        return this.required_number;
    }

    @Import(name="required_string", required=true)
    private Output<String> required_string;

    public Output<String> required_string() {
        return this.required_string;
    }

    private ModuleResourceArgs() {}

    private ModuleResourceArgs(ModuleResourceArgs $) {
        this.optional_bool = $.optional_bool;
        this.optional_const = $.optional_const;
        this.optional_enum = $.optional_enum;
        this.optional_number = $.optional_number;
        this.optional_string = $.optional_string;
        this.plain_optional_bool = $.plain_optional_bool;
        this.plain_optional_const = $.plain_optional_const;
        this.plain_optional_number = $.plain_optional_number;
        this.plain_optional_string = $.plain_optional_string;
        this.plain_required_bool = $.plain_required_bool;
        this.plain_required_const = $.plain_required_const;
        this.plain_required_number = $.plain_required_number;
        this.plain_required_string = $.plain_required_string;
        this.required_bool = $.required_bool;
        this.required_enum = $.required_enum;
        this.required_number = $.required_number;
        this.required_string = $.required_string;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModuleResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModuleResourceArgs $;

        public Builder() {
            $ = new ModuleResourceArgs();
        }

        public Builder(ModuleResourceArgs defaults) {
            $ = new ModuleResourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder optional_bool(@Nullable Output<Boolean> optional_bool) {
            $.optional_bool = optional_bool;
            return this;
        }

        public Builder optional_bool(Boolean optional_bool) {
            return optional_bool(Output.of(optional_bool));
        }

        public Builder optional_const(@Nullable Output<String> optional_const) {
            $.optional_const = optional_const;
            return this;
        }

        public Builder optional_const(String optional_const) {
            return optional_const(Output.of(optional_const));
        }

        public Builder optional_enum(@Nullable Output<EnumThing> optional_enum) {
            $.optional_enum = optional_enum;
            return this;
        }

        public Builder optional_enum(EnumThing optional_enum) {
            return optional_enum(Output.of(optional_enum));
        }

        public Builder optional_number(@Nullable Output<Double> optional_number) {
            $.optional_number = optional_number;
            return this;
        }

        public Builder optional_number(Double optional_number) {
            return optional_number(Output.of(optional_number));
        }

        public Builder optional_string(@Nullable Output<String> optional_string) {
            $.optional_string = optional_string;
            return this;
        }

        public Builder optional_string(String optional_string) {
            return optional_string(Output.of(optional_string));
        }

        public Builder plain_optional_bool(@Nullable Boolean plain_optional_bool) {
            $.plain_optional_bool = plain_optional_bool;
            return this;
        }

        public Builder plain_optional_const(@Nullable String plain_optional_const) {
            $.plain_optional_const = plain_optional_const;
            return this;
        }

        public Builder plain_optional_number(@Nullable Double plain_optional_number) {
            $.plain_optional_number = plain_optional_number;
            return this;
        }

        public Builder plain_optional_string(@Nullable String plain_optional_string) {
            $.plain_optional_string = plain_optional_string;
            return this;
        }

        public Builder plain_required_bool(Boolean plain_required_bool) {
            $.plain_required_bool = plain_required_bool;
            return this;
        }

        public Builder plain_required_const(String plain_required_const) {
            $.plain_required_const = plain_required_const;
            return this;
        }

        public Builder plain_required_number(Double plain_required_number) {
            $.plain_required_number = plain_required_number;
            return this;
        }

        public Builder plain_required_string(String plain_required_string) {
            $.plain_required_string = plain_required_string;
            return this;
        }

        public Builder required_bool(Output<Boolean> required_bool) {
            $.required_bool = required_bool;
            return this;
        }

        public Builder required_bool(Boolean required_bool) {
            return required_bool(Output.of(required_bool));
        }

        public Builder required_enum(Output<EnumThing> required_enum) {
            $.required_enum = required_enum;
            return this;
        }

        public Builder required_enum(EnumThing required_enum) {
            return required_enum(Output.of(required_enum));
        }

        public Builder required_number(Output<Double> required_number) {
            $.required_number = required_number;
            return this;
        }

        public Builder required_number(Double required_number) {
            return required_number(Output.of(required_number));
        }

        public Builder required_string(Output<String> required_string) {
            $.required_string = required_string;
            return this;
        }

        public Builder required_string(String required_string) {
            return required_string(Output.of(required_string));
        }

        public ModuleResourceArgs build() {
            $.optional_bool = Codegen.booleanProp("optional_bool").output().arg($.optional_bool).def(true).getNullable();
            $.optional_const = Codegen.stringProp("optional_const").output().arg($.optional_const).def("another").getNullable();
            $.optional_enum = Codegen.objectProp("optional_enum", EnumThing.class).output().arg($.optional_enum).def(EnumThing.Eight).getNullable();
            $.optional_number = Codegen.doubleProp("optional_number").output().arg($.optional_number).def(4.2e+01).getNullable();
            $.optional_string = Codegen.stringProp("optional_string").output().arg($.optional_string).def("buzzer").getNullable();
            $.plain_optional_bool = Codegen.booleanProp("plain_optional_bool").arg($.plain_optional_bool).def(true).getNullable();
            $.plain_optional_const = Codegen.stringProp("plain_optional_const").arg($.plain_optional_const).def("another").getNullable();
            $.plain_optional_number = Codegen.doubleProp("plain_optional_number").arg($.plain_optional_number).def(4.2e+01).getNullable();
            $.plain_optional_string = Codegen.stringProp("plain_optional_string").arg($.plain_optional_string).def("buzzer").getNullable();
            $.plain_required_bool = Codegen.booleanProp("plain_required_bool").arg($.plain_required_bool).def(true).require();
            $.plain_required_const = Codegen.stringProp("plain_required_const").arg($.plain_required_const).def("another").require();
            $.plain_required_number = Codegen.doubleProp("plain_required_number").arg($.plain_required_number).def(4.2e+01).require();
            $.plain_required_string = Codegen.stringProp("plain_required_string").arg($.plain_required_string).def("buzzer").require();
            $.required_bool = Codegen.booleanProp("required_bool").output().arg($.required_bool).def(true).require();
            $.required_enum = Codegen.objectProp("required_enum", EnumThing.class).output().arg($.required_enum).def(EnumThing.Four).require();
            $.required_number = Codegen.doubleProp("required_number").output().arg($.required_number).def(4.2e+01).require();
            $.required_string = Codegen.stringProp("required_string").output().arg($.required_string).def("buzzer").require();
            return $;
        }
    }

}
