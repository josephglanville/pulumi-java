// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.x_iam.inputs;

import com.pulumi.aws.x.inputs.GetPolicyDocumentStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPolicyDocumentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPolicyDocumentArgs Empty = new GetPolicyDocumentArgs();

    @Import(name="statements")
    private @Nullable Output<List<GetPolicyDocumentStatementArgs>> statements;

    public Optional<Output<List<GetPolicyDocumentStatementArgs>>> statements() {
        return Optional.ofNullable(this.statements);
    }

    private GetPolicyDocumentArgs() {}

    private GetPolicyDocumentArgs(GetPolicyDocumentArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicyDocumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicyDocumentArgs $;

        public Builder() {
            $ = new GetPolicyDocumentArgs();
        }

        public Builder(GetPolicyDocumentArgs defaults) {
            $ = new GetPolicyDocumentArgs(Objects.requireNonNull(defaults));
        }

        public Builder statements(@Nullable Output<List<GetPolicyDocumentStatementArgs>> statements) {
            $.statements = statements;
            return this;
        }

        public Builder statements(List<GetPolicyDocumentStatementArgs> statements) {
            return statements(Output.of(statements));
        }

        public Builder statements(GetPolicyDocumentStatementArgs... statements) {
            return statements(List.of(statements));
        }

        public GetPolicyDocumentArgs build() {
            return $;
        }
    }

}
