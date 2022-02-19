package com.traeper.api_documentation.sample

import org.springframework.web.bind.annotation.*

@RequestMapping("/api/v1/samples")
@RestController
class SampleController {
    @GetMapping("{sampleId}")
    fun getSampleById(
        @PathVariable sampleId: String,
    ): SampleResponse =
        SampleResponse(sampleId, "sample-$sampleId")
}