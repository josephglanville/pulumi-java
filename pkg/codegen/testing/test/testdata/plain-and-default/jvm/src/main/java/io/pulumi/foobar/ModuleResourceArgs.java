// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.foobar;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.foobar.enums.EnumThing;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModuleResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModuleResourceArgs Empty = new ModuleResourceArgs();

    @Import(name="optional_bool")
      private final @Nullable Output<Boolean> optional_bool;

    public Output<Boolean> getOptional_bool() {
        return this.optional_bool == null ? Output.empty() : this.optional_bool;
    }

    @Import(name="optional_const")
      private final @Nullable Output<String> optional_const;

    public Output<String> getOptional_const() {
        return this.optional_const == null ? Output.empty() : this.optional_const;
    }

    @Import(name="optional_enum")
      private final @Nullable Output<EnumThing> optional_enum;

    public Output<EnumThing> getOptional_enum() {
        return this.optional_enum == null ? Output.empty() : this.optional_enum;
    }

    @Import(name="optional_number")
      private final @Nullable Output<Double> optional_number;

    public Output<Double> getOptional_number() {
        return this.optional_number == null ? Output.empty() : this.optional_number;
    }

    @Import(name="optional_string")
      private final @Nullable Output<String> optional_string;

    public Output<String> getOptional_string() {
        return this.optional_string == null ? Output.empty() : this.optional_string;
    }

    @Import(name="plain_optional_bool")
      private final @Nullable Boolean plain_optional_bool;

    public Optional<Boolean> getPlain_optional_bool() {
        return this.plain_optional_bool == null ? Optional.empty() : Optional.ofNullable(this.plain_optional_bool);
    }

    @Import(name="plain_optional_const")
      private final @Nullable String plain_optional_const;

    public Optional<String> getPlain_optional_const() {
        return this.plain_optional_const == null ? Optional.empty() : Optional.ofNullable(this.plain_optional_const);
    }

    @Import(name="plain_optional_number")
      private final @Nullable Double plain_optional_number;

    public Optional<Double> getPlain_optional_number() {
        return this.plain_optional_number == null ? Optional.empty() : Optional.ofNullable(this.plain_optional_number);
    }

    @Import(name="plain_optional_string")
      private final @Nullable String plain_optional_string;

    public Optional<String> getPlain_optional_string() {
        return this.plain_optional_string == null ? Optional.empty() : Optional.ofNullable(this.plain_optional_string);
    }

    @Import(name="plain_required_bool", required=true)
      private final Boolean plain_required_bool;

    public Boolean getPlain_required_bool() {
        return this.plain_required_bool;
    }

    @Import(name="plain_required_const", required=true)
      private final String plain_required_const;

    public String getPlain_required_const() {
        return this.plain_required_const;
    }

    @Import(name="plain_required_number", required=true)
      private final Double plain_required_number;

    public Double getPlain_required_number() {
        return this.plain_required_number;
    }

    @Import(name="plain_required_string", required=true)
      private final String plain_required_string;

    public String getPlain_required_string() {
        return this.plain_required_string;
    }

    @Import(name="required_bool", required=true)
      private final Output<Boolean> required_bool;

    public Output<Boolean> getRequired_bool() {
        return this.required_bool;
    }

    @Import(name="required_enum", required=true)
      private final Output<EnumThing> required_enum;

    public Output<EnumThing> getRequired_enum() {
        return this.required_enum;
    }

    @Import(name="required_number", required=true)
      private final Output<Double> required_number;

    public Output<Double> getRequired_number() {
        return this.required_number;
    }

    @Import(name="required_string", required=true)
      private final Output<String> required_string;

    public Output<String> getRequired_string() {
        return this.required_string;
    }

    public ModuleResourceArgs(
        @Nullable Output<Boolean> optional_bool,
        @Nullable Output<String> optional_const,
        @Nullable Output<EnumThing> optional_enum,
        @Nullable Output<Double> optional_number,
        @Nullable Output<String> optional_string,
        @Nullable Boolean plain_optional_bool,
        @Nullable String plain_optional_const,
        @Nullable Double plain_optional_number,
        @Nullable String plain_optional_string,
        Boolean plain_required_bool,
        String plain_required_const,
        Double plain_required_number,
        String plain_required_string,
        Output<Boolean> required_bool,
        Output<EnumThing> required_enum,
        Output<Double> required_number,
        Output<String> required_string) {
        this.optional_bool = optional_bool == null ? Output.ofNullable(true) : optional_bool;
        this.optional_const = optional_const == null ? Output.ofNullable("another") : optional_const;
        this.optional_enum = optional_enum == null ? Output.ofNullable(io.pulumi.foobar.enums.EnumThing.Eight) : optional_enum;
        this.optional_number = optional_number == null ? Output.ofNullable(4.2e+01) : optional_number;
        this.optional_string = optional_string == null ? Output.ofNullable("buzzer") : optional_string;
        this.plain_optional_bool = plain_optional_bool == null ? true : plain_optional_bool;
        this.plain_optional_const = plain_optional_const == null ? "another" : plain_optional_const;
        this.plain_optional_number = plain_optional_number == null ? 4.2e+01 : plain_optional_number;
        this.plain_optional_string = plain_optional_string == null ? "buzzer" : plain_optional_string;
        this.plain_required_bool = plain_required_bool == null ? true : Objects.requireNonNull(plain_required_bool, "expected parameter 'plain_required_bool' to be non-null");
        this.plain_required_const = plain_required_const == null ? "another" : Objects.requireNonNull(plain_required_const, "expected parameter 'plain_required_const' to be non-null");
        this.plain_required_number = plain_required_number == null ? 4.2e+01 : Objects.requireNonNull(plain_required_number, "expected parameter 'plain_required_number' to be non-null");
        this.plain_required_string = plain_required_string == null ? "buzzer" : Objects.requireNonNull(plain_required_string, "expected parameter 'plain_required_string' to be non-null");
        this.required_bool = required_bool == null ? Output.ofNullable(true) : Objects.requireNonNull(required_bool, "expected parameter 'required_bool' to be non-null");
        this.required_enum = required_enum == null ? Output.ofNullable(io.pulumi.foobar.enums.EnumThing.Four) : Objects.requireNonNull(required_enum, "expected parameter 'required_enum' to be non-null");
        this.required_number = required_number == null ? Output.ofNullable(4.2e+01) : Objects.requireNonNull(required_number, "expected parameter 'required_number' to be non-null");
        this.required_string = required_string == null ? Output.ofNullable("buzzer") : Objects.requireNonNull(required_string, "expected parameter 'required_string' to be non-null");
    }

    private ModuleResourceArgs() {
        this.optional_bool = Output.empty();
        this.optional_const = Output.empty();
        this.optional_enum = Output.empty();
        this.optional_number = Output.empty();
        this.optional_string = Output.empty();
        this.plain_optional_bool = null;
        this.plain_optional_const = null;
        this.plain_optional_number = null;
        this.plain_optional_string = null;
        this.plain_required_bool = null;
        this.plain_required_const = null;
        this.plain_required_number = null;
        this.plain_required_string = null;
        this.required_bool = Output.empty();
        this.required_enum = Output.empty();
        this.required_number = Output.empty();
        this.required_string = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModuleResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> optional_bool;
        private @Nullable Output<String> optional_const;
        private @Nullable Output<EnumThing> optional_enum;
        private @Nullable Output<Double> optional_number;
        private @Nullable Output<String> optional_string;
        private @Nullable Boolean plain_optional_bool;
        private @Nullable String plain_optional_const;
        private @Nullable Double plain_optional_number;
        private @Nullable String plain_optional_string;
        private Boolean plain_required_bool;
        private String plain_required_const;
        private Double plain_required_number;
        private String plain_required_string;
        private Output<Boolean> required_bool;
        private Output<EnumThing> required_enum;
        private Output<Double> required_number;
        private Output<String> required_string;

        public Builder() {
    	      // Empty
        }

        public Builder(ModuleResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.optional_bool = defaults.optional_bool;
    	      this.optional_const = defaults.optional_const;
    	      this.optional_enum = defaults.optional_enum;
    	      this.optional_number = defaults.optional_number;
    	      this.optional_string = defaults.optional_string;
    	      this.plain_optional_bool = defaults.plain_optional_bool;
    	      this.plain_optional_const = defaults.plain_optional_const;
    	      this.plain_optional_number = defaults.plain_optional_number;
    	      this.plain_optional_string = defaults.plain_optional_string;
    	      this.plain_required_bool = defaults.plain_required_bool;
    	      this.plain_required_const = defaults.plain_required_const;
    	      this.plain_required_number = defaults.plain_required_number;
    	      this.plain_required_string = defaults.plain_required_string;
    	      this.required_bool = defaults.required_bool;
    	      this.required_enum = defaults.required_enum;
    	      this.required_number = defaults.required_number;
    	      this.required_string = defaults.required_string;
        }

        public Builder optional_bool(@Nullable Output<Boolean> optional_bool) {
            this.optional_bool = optional_bool;
            return this;
        }
        public Builder optional_bool(@Nullable Boolean optional_bool) {
            this.optional_bool = Output.ofNullable(optional_bool);
            return this;
        }
        public Builder optional_const(@Nullable Output<String> optional_const) {
            this.optional_const = optional_const;
            return this;
        }
        public Builder optional_const(@Nullable String optional_const) {
            this.optional_const = Output.ofNullable(optional_const);
            return this;
        }
        public Builder optional_enum(@Nullable Output<EnumThing> optional_enum) {
            this.optional_enum = optional_enum;
            return this;
        }
        public Builder optional_enum(@Nullable EnumThing optional_enum) {
            this.optional_enum = Output.ofNullable(optional_enum);
            return this;
        }
        public Builder optional_number(@Nullable Output<Double> optional_number) {
            this.optional_number = optional_number;
            return this;
        }
        public Builder optional_number(@Nullable Double optional_number) {
            this.optional_number = Output.ofNullable(optional_number);
            return this;
        }
        public Builder optional_string(@Nullable Output<String> optional_string) {
            this.optional_string = optional_string;
            return this;
        }
        public Builder optional_string(@Nullable String optional_string) {
            this.optional_string = Output.ofNullable(optional_string);
            return this;
        }
        public Builder plain_optional_bool(@Nullable Boolean plain_optional_bool) {
            this.plain_optional_bool = plain_optional_bool;
            return this;
        }
        public Builder plain_optional_const(@Nullable String plain_optional_const) {
            this.plain_optional_const = plain_optional_const;
            return this;
        }
        public Builder plain_optional_number(@Nullable Double plain_optional_number) {
            this.plain_optional_number = plain_optional_number;
            return this;
        }
        public Builder plain_optional_string(@Nullable String plain_optional_string) {
            this.plain_optional_string = plain_optional_string;
            return this;
        }
        public Builder plain_required_bool(Boolean plain_required_bool) {
            this.plain_required_bool = Objects.requireNonNull(plain_required_bool);
            return this;
        }
        public Builder plain_required_const(String plain_required_const) {
            this.plain_required_const = Objects.requireNonNull(plain_required_const);
            return this;
        }
        public Builder plain_required_number(Double plain_required_number) {
            this.plain_required_number = Objects.requireNonNull(plain_required_number);
            return this;
        }
        public Builder plain_required_string(String plain_required_string) {
            this.plain_required_string = Objects.requireNonNull(plain_required_string);
            return this;
        }
        public Builder required_bool(Output<Boolean> required_bool) {
            this.required_bool = Objects.requireNonNull(required_bool);
            return this;
        }
        public Builder required_bool(Boolean required_bool) {
            this.required_bool = Output.of(Objects.requireNonNull(required_bool));
            return this;
        }
        public Builder required_enum(Output<EnumThing> required_enum) {
            this.required_enum = Objects.requireNonNull(required_enum);
            return this;
        }
        public Builder required_enum(EnumThing required_enum) {
            this.required_enum = Output.of(Objects.requireNonNull(required_enum));
            return this;
        }
        public Builder required_number(Output<Double> required_number) {
            this.required_number = Objects.requireNonNull(required_number);
            return this;
        }
        public Builder required_number(Double required_number) {
            this.required_number = Output.of(Objects.requireNonNull(required_number));
            return this;
        }
        public Builder required_string(Output<String> required_string) {
            this.required_string = Objects.requireNonNull(required_string);
            return this;
        }
        public Builder required_string(String required_string) {
            this.required_string = Output.of(Objects.requireNonNull(required_string));
            return this;
        }        public ModuleResourceArgs build() {
            return new ModuleResourceArgs(optional_bool, optional_const, optional_enum, optional_number, optional_string, plain_optional_bool, plain_optional_const, plain_optional_number, plain_optional_string, plain_required_bool, plain_required_const, plain_required_number, plain_required_string, required_bool, required_enum, required_number, required_string);
        }
    }
}
