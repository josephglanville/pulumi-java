// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.azurenative.testbase.enums.TestType;
import io.pulumi.azurenative.testbase.inputs.CommandArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TestArgs extends io.pulumi.resources.ResourceArgs {

    public static final TestArgs Empty = new TestArgs();

    @InputImport(name="commands", required=true)
    private final Input<List<CommandArgs>> commands;

    public Input<List<CommandArgs>> getCommands() {
        return this.commands;
    }

    @InputImport(name="isActive")
    private final @Nullable Input<Boolean> isActive;

    public Input<Boolean> getIsActive() {
        return this.isActive == null ? Input.empty() : this.isActive;
    }

    @InputImport(name="testType", required=true)
    private final Input<Either<String,TestType>> testType;

    public Input<Either<String,TestType>> getTestType() {
        return this.testType;
    }

    public TestArgs(
        Input<List<CommandArgs>> commands,
        @Nullable Input<Boolean> isActive,
        Input<Either<String,TestType>> testType) {
        this.commands = Objects.requireNonNull(commands, "expected parameter 'commands' to be non-null");
        this.isActive = isActive;
        this.testType = Objects.requireNonNull(testType, "expected parameter 'testType' to be non-null");
    }

    private TestArgs() {
        this.commands = Input.empty();
        this.isActive = Input.empty();
        this.testType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<CommandArgs>> commands;
        private @Nullable Input<Boolean> isActive;
        private Input<Either<String,TestType>> testType;

        public Builder() {
    	      // Empty
        }

        public Builder(TestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commands = defaults.commands;
    	      this.isActive = defaults.isActive;
    	      this.testType = defaults.testType;
        }

        public Builder setCommands(Input<List<CommandArgs>> commands) {
            this.commands = Objects.requireNonNull(commands);
            return this;
        }

        public Builder setCommands(List<CommandArgs> commands) {
            this.commands = Input.of(Objects.requireNonNull(commands));
            return this;
        }

        public Builder setIsActive(@Nullable Input<Boolean> isActive) {
            this.isActive = isActive;
            return this;
        }

        public Builder setIsActive(@Nullable Boolean isActive) {
            this.isActive = Input.ofNullable(isActive);
            return this;
        }

        public Builder setTestType(Input<Either<String,TestType>> testType) {
            this.testType = Objects.requireNonNull(testType);
            return this;
        }

        public Builder setTestType(Either<String,TestType> testType) {
            this.testType = Input.of(Objects.requireNonNull(testType));
            return this;
        }

        public TestArgs build() {
            return new TestArgs(commands, isActive, testType);
        }
    }
}
