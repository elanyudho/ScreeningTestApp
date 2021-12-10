package com.dicoding.screeningtestapp.dummy

import com.dicoding.screeningtestapp.model.Event

object DummyData{
    fun listEvent(): List<Event> {
        return listOf(
            Event(
                "Android Study Jams - North America",
                "June 14 - December 31",
                "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAoHCBUVFRgWFRYVGBgYGBgWGBgZGBoaGBoVGBgaGhgVGhgcIy4lHB4rIRgcJjgmKy80NTU1GiQ7QDszPy40NTUBDAwMEA8QHxISH0AlJSw9NDQ1NDc6OjQ0NDQ0MTQ0NjU/MTQ0NDE0NzQ0NDQ0NDQ1NDQ0NDQ3NDExMTQ0NDQ/NP/AABEIAKMBNgMBIgACEQEDEQH/xAAbAAEAAgMBAQAAAAAAAAAAAAAAAQIDBAYFB//EAEgQAAICAQIDAwYIDAMIAwAAAAECABEDEiEEBTEiQVEGEzJSYZMzcXKBkbGy0xQWNEJTc5Khs8HR0iPC8AcVNWJ0gsPhJKLx/8QAGQEBAAMBAQAAAAAAAAAAAAAAAAEDBAIF/8QALBEBAAIBAgQFBAEFAAAAAAAAAAECEQMSBCExQQUTMlFxMzRhgbEiNUKRof/aAAwDAQACEQMRAD8A+cxETSykkmREBESRAiJZlqVgJIkS2k1fd0gViJYuaqBAMiIgIlhVe2VgIiWLQCsR0lYkgQIlgRXTfxlYgIiSYES5Ir2ykuqd5IH1/RApE2UwDxuXGJfCBpyxY/RMrMdWnYDp09kwQEREBEsq3KwEm5EQEREBERAS6sADtd/ulIgJZfbKxAREQJMiJkGnT7YGOIiAiIgInr8m5YmVWLlxTV2SPAHvBnpDycxetk+lf7ZfXh72ruhzFomcOWidnw/kliYWXyAd267/AP1mb8TsHr5f2k/tnm63GaOleaTOZjrjm3U4DWvWLRHKXDROm53ybhuGT08rO3oJqX9puzsv1zmZdo6satd0dFGtozpW2z1IiJaqJYCViAiIgIltW1fPKwNnHmFAGWbOO7eaksVI+eBOuzZ8RIerNSsQERMj6aFde+BjiIgSIMiICWdgegqViAiIgSIMiIFkajZh2s2JWIEgQRUiSTAiIk13wIlgZWICIiB03ksvYf5f+UTo+GwXuen1/wDqeD5ILaP8sfZE6hTK+M422no+Xp9Z6z7Nvh/Ab9SdbU6do92wpnm875wnDJ3M7egn+Y+CzJx/FMiMyLrcC1Xx/wBfvnKfi3xue8rhQzb9ttLV3AKAdI9hqeHw/BzaY1NXlH8vS47jqaEbKzzn/jwuJ4l8jl3YszdT/IeA9kxTe5xy58GQoyMo/NJ6MAACwI2IJ3rusTRnvVxtjb0eBu3/ANWc5dR5KchGdHZ8TuMjjhcTorsMWVsbP599I2VW80N9qyN4TS5byEZFx68wxPlzPw2PGyOx86nmwQ5U0i6siqTuQe471XDwvF5sCebRvN4vOBNDKjM1+cyMqlg2RhYsqDQVR3THxHOs5yY8rKisuZ+LTsFVbI7IXevzlLYB07w3zObvljo9LkXIsZy4BxDqHyI+RcBRzqQK4XVkU0rEoWC77AWRdTUx+T6lcd8QoZ8C8U40ORj4coWLsw9J7pQijfUNxMfC+UeVNBCYGdA6pkdNWREcsWRWutPbarBI1EAgSjcwz4nxOyqK4dMaqyhkycMUKKrrfaDLd9DtexAjmZq2V5L2WfGUzI+HXicoyPqHE4sLIE1dlw2QdSylW267ZM/J8OPBxVZVy5cL4UakdBjc5Sj6GJp12K6qHTpuDNDNzvKwKgIiHH5pURSqInnUzEpZJDl0BLEknx6Vn5pzjOVfG+PChzebyZWRAr5CQuVMjMGIBIfVSgDtna45nJ4sRE6cEkmRECy9d+kPV7dJWICIk1AiWVblZIMCJfGwB3FykQLMd5A9siICIiBIEiWViOkrAsBKxEBEyaxpqt/H55jgJbUarulYgImXAoJ3mXMoA6D/AEIGrERA6zyQPYf5f+UT33y6R7ZzXkrmVUfUyjt95A/NHjPafOh/PT9of1llOGpqTFrdG3U8Q8nQilOdv4X1kmzPQ4PiVOlXAIU6kY76WogH2bEi/bPI/CE9dP2hJXik9dP2h/Wb9XR0tWmzt2/Dyt06sYv/ALer5S4EyYMiurE4088COzuurZXKlQSFII32PTcT5hkYEkqNI7hd18/fO25zzJm4d8aMjEgA9satH5wA7z3fET7Jw08muhbRmaz+nejpzSJiXU8kwrlxY1znh2wKcmp/OjHxHCajuwtgXVvSC6XBJI2MypkGbHwoYcPpPBZ8C2MCFeLH4RoVzsy+ljILUupw12xM5GoqThfuddg4NERUUcM3FjhzpDNgdPOHi8moMWJxtmXFpADE0Aa3AmzxGPDxGVcGU4V/+Jw7tlxaCuJ+H1vxCKyWqqcZybA6dSpW1TiKmXDxDoHCNpDpoeq3QsrFb6gEqvTrVdLjCdzcGE8VlyHGuLGWLOmIsmMaSwAxYy1JqVT0JFhSdztOp4QYjlyNfD5Sn4FhcFuG0jHj4ZEzZNedWDYwylSEGo0O0Nr4WKiYyiLYdthycMmbDjCcK2Js/HLkLpjcnEruMAORu0i0AVIIJ23O0w8rzJkXA7Jw7Znw51cKvC42DJmx+bZMTp5lnCFhTAEpZBtROPio2p3N/nmNV4jKqMjqH2bGqqhsAkKqkqKJIpSRYNbVNCInTha9pWJJECJYsarulYgIiICJkdwQABvMcCzCViSIAiRLM1xArERARLu9ykBEtcrAsplYiBINSz5CesrUiAiIgIqb3D8sd8bZAV0r5zY67PmkXI5sKVXssK1MLNgXKjlmfUE8zl1FdQXQ16bAuq8SB8ZA6mBp1FTbXl2YhSMWQh70dhu1QLGtt9lY/EpPcZLcrzhgpw5QzaqBRgTorV3d1j6R4iBp1Ez4+EyNr0o50WXpT2Ku9Xh6J6+qfAyOJ4XJjALo6arK6lK3VXV9eo+keIgYYnoZuTZ1c4wjO4AY6AXFE11A6hgUP/MpG8rh5RndNa43K2oXstbltXoCu16Bv4oGjE225blFFkdFOumZG0korOwsA70jezYnYAkXPKcoOMOhQ5n82gcFTq7HaII2X/EXf2HbaBoxN08sc6fN1lDawDjDtumnWpDKrKRrTqKOsVcxLwWVjpGNy3Z20NfaUstitrVWPxKT3QNeJvf7pz0KxuxIclVViy6HZCHWuydSnaYxy/NSHzWSnrQdDU9rqGk1va23xAnoIGrE2MvBZEUs6OqhtBLKQNfXTZ7/AGTXgIiICJNSIFmO8rEQESSZEBEsr0CNt5WAiIgSRIiICIlmq9oFYiIFyBQ337xKREC5ydmpSIgIl0KfnK58NLhfrRrl9WP1cnvF+7gbPC81fHjONVWich1EvY86io/ZDBG7KCtSmjvNrivKF8hPnER1a2ZC2XSXLBtY7druo2UgV8xHmasfq5PeL93GrH6uT3i/dwZbn++G0kBEBZBjdhrt1XA+BAQWIGlHPQCyATe95cHlBkUt2UIf0h21saMS1qVgR8Ch6+Pcannasfq5PeL93GrH6uT3i/dwnLe4Tnb42yOFRmyMXYtrsE67FhwWXtnZidwp6iY8nNnZ1dlQlcpz1R0lyMYoi91/w12+OaurH6uT3i/dxqx+rk94v3cIy3zz3KQA2hyCp1laYhci5VU6aFawT0vttv0qw5+41EJi1uoV37dsqo+NBWvSKVyNhvQvvvztWP1cnvF+7jVj9XJ7xfu4TltpzZ1UqqICyLjd+1qdVwvgQEFtIKo56AWQLve2bmzM6OExqyZm4g6dZD5nKM7Nqc7E412Wq3mpqx+rk94v3casfq5PeL93Bl6HDc9fHYRMaoQ1opyAFmZGLl9eu/8ADQelVDpuTLYvKLMun0TXnNV67cZCWIZ9Wrslm0m7Go3c83Vj9XJ7xfu41Y/Vye8X7uEZek3lA7EFkxvpdciBjkOl1d3Rr122nzjCiSCKvpclefsjBkRASmJMjHXqcpw/mTdPSjtOQV0n0fAieZqx+rk94v3casfq5PeL93Ccs/MeYvm06wOyWIosT2gi0WdiSAEUD/8AJpTNqx+rk94v3casfq5PeL93CGGJZiL7IIHgSCfpAH1SsC75LAHhKREC1CrvfwlYiAiJZa74FYiIEgRIiAiXyPZ6VKgwIiWdrNysC6gb2filIkiBEtp2uQZECRJY2fCViAie9ybkyOut21CyNA26H84/ymtzPilGRKxBRjO6sAuoWOo8NtuvWRfdWY5Tie/ZZFKzpzbdGfbu8qJ2HEch87jGXzb4SwuytfOy9w9u05XAg1EGmAVz1NEqrEbitrEr09Wt4nb2VRnpMYn8sMTcx8MHXUBorUGA3BrTRUMevaAomQ/B0fSBG9mvRAXVZo+F7eKmWZdYlqRN9eAo9og1eobDfQx7JBs0R4CUTgrbSH7SkBuzsLIBo3vRIHQRmDbLTibePhAw1K1rvZ00bGnaiaN6h3+Mrm4UICS970oAu+yrbm9vSrv3EZMS1om9jxI2kACrQMQW1gkgNYOxUk0COliYzwotQG2bXVjpovuv2Rkw1Ym9j4MHUuq3GkdCApLAEg3vQsdJR+EAsl9gLOwLbMq1pDVvqHf4xmDbLUibXEcOqJeok6iOlArpVh37bN+/2SOIKoSmgGhWoltWqvSG9AeyukZMNaJucRwoD0DQOsj2aQdvb0lsvCoXYK4FEWCNgpIF6id6JHWusZNstGSTMnEYtBrfoDuKO/ssj5wZikoJYrtcrEBERAu4HcblIiAiWR6lYCJlwuBdi4gYokiS1XtAlK77+aZBgsWD9ImCbmLICAIGFuHPdvKHG3gZuTWJtzv/AKAgYYiXTHd+yBSIllQkE+EDJwvEvjbUjFT7OhHgR0Im+/PchyY8hVNWM2BpNE2DvZ9ndPKlmqhXXvkzaZrNZ6T2IjE7u71+deUvEcT2XYKnqJYU+1t7b5zXsnkY3Kmx13HQHYiiKO3QyskCV0060jFYxCZtMzmZzLL+Evd2OhFaV00dyNNV+6VOdu1vs1BgAACF6Ch0r2SrLRqVnaMs54p/EX46Vs7EbmrOxPWWTjHBBsbEHoATp6aiN2r2zWllFmpGE5lk/Cn9nQitK6SDV2tUbofQJR8rN1PfdUALoDu9ij6IdaNSAJKMsv4S9AX4b0NXZIKgtVmqH0STxTjwHU+gu2oUa22v2TADUlms2ZGE5ll/Cn8fCyALOkgrbVZqpV87EVsARVBVA6g9APED6JiiMGWZ3cruQQSO4XYAXY1tso+iBxLVVjppvSpYL0oNV188xXIkoy2G4p99weu+lb7WxANbA+yDxj9bF7WdK2a6Wa3rwM14kYTmV8mQt1rYUAAAALJoAbdSfpkFtqofHKxJQRJAlsiaYFQYMiTUCJd8dAHxlJNwIiJZa74FYiICJJEiAiJZ3s3AgmWRqv4iBKRASQZEQEsGMrLGBWIm9xvK8mJFd9OlyAKNncFhY+ISJmImImerqtbWiZiOUdWmgHealZfHj1T0MfJcrKHASiNQ7Xd1nda2t6Yy4mYjq8yJt8u5c+csE09kAmzXW6+qRx/BPhfQ9XQbY2KJI/kZXvru255+yzy7bd2OXu1hIiZFwsV1BTQ7/mJP7lP0SZnDmImejHETLw2MO6IbpnRTXWmYA19MlDFE7DnPB8r4bO+B15gzY2CllfBpJKhtrAPf4TT87yn9HzL9vh5CcObidJ53lP6PmX7fDx53lP6PmX7fDwYc64F7biVnZcm5byzinbFjXjkcY3cM74dPYW6OkEzj8K6q+K4QIaPS5WWZaNTc4nleRMa5G06X01Rs9oaht8UibViYiZ6u60taJmIzjq0Zd0rvuUidOCSTIiAm3gPZE1JYOR0MC2YgmY4iBbTtdj4pWIgIlgLkQIllrvlYgJYCViAmREBBN9JjiAlgBR337pWICIlmFQOm8l/gsnyz9hZ7acCmdcCZF1KQDVldxiat1IM8TyX+CyfLP2FnSct9Lh/i/wDE0r8QmYrpTH5aOHnGjrfEOY8pOX4+HzBcSlVKKxBZm7RZxdsSegE9PgPgE/Vj7M1vLb8pX9Un28k2eA+AT9WPszZ4fMzGZ9mCZmaRMvP8kEAZ69RPraanlf8ADj9Wv2nm75I+k/yE+tppeV/w4/Vr9p55Efdz8Pct9hX5eEZ3HDcjxFFpnplBrUKpgb7v+dvpnMDhcPr5f2E/vnt8NzhExDGDksKVV9C2B3dnXvX8hLeJi9sbGbgtbRpNvNjty5Oc47AEelJIIsWKYDUQARZ7gDfeCJHAfC4/1ifbWbX4LiJ3yZdzuSiHr3nt7zDgx6OJVLvRnVL8dOQC6+aX1nliWS1om04jD1fLr/iPFfLH8NJ4JP8Aqx/Se95df8R4r5Y/hpPBLe39/wD6nUEoaVkkSJKHU/7Ovytv+nz/AGBOZ4Pu+T/SdN/s6/K2/wCnz/YE5ng+75P9JA7Xya5Dw+fEXyIWbWy2GZdgFrZSB3zMvwfD/En8F5u+RX5Of1j/AFLNNfg+H/7P4LzJW0zxVIn3hfwczNNbPs5Xyl+HPyF/nPLBnqeUvw5+Qv8AOeZp2u56Gt9Sflmr6YVlmA2o/HKxK3RMmVAOhuY4gSIMiICWau6ViAiIgIiICIiAiIgIiICIiB1Hkv8ABZPln7CzpOW+lw/xf+JoiVeI+jS/bRofR1/iHheW35Sv6pPt5Js8B8An6sfZiJs8O6fp5/8AhVo+SPpP8hPraanlUL4lR4og+l2iJ5VPvJe5b+3x8vRCr6mL3af0k6V9TF7tP6RE97y6e0PEWIABITGCNwRjSwfHpOeyCuLHtzIfnLg3++ImW9YiOnd1Tq+wcx8j+Cz5Xy5cRbI7As3ncq3sB0VgB07pp/iHy/8AQH32b++ImdoPxD5f+gPvs398fiHy/wDQH32b++IgbPB+S/CcNryYcZR/NZRfnMjbFRtTMRPifB93yf6SYiES+j+RX5Of1j/Us01+D4f/ALP4LxEx0+6r8ws4P0a/w5Xyl+HPyF/nPKiJ6Wv9Sflnr6YIiJW6IiICIiAiIgIiIH//2Q=="
            ),
            Event(
                "DevFest 2021",
                "October 1 - December 31",
                "data:image/jpeg;base64,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"
            ), Event(
                "Cloud Learn",
                "December 8-9",
                "https://developers.google.com/events/images/cloud-learn_480.png"
            ), Event(
                "Web @ DevFest",
                "December 8",
                "https://res.cloudinary.com/startup-grind/image/upload/c_fill,dpr_2,f_auto,g_center,q_auto:good/v1/gcs/platform-data-goog/events/DevFest%20header%20%281%29_rCmGfdZ.png"
            ), Event(
                "Gaming Day on Google Open Source Live",
                ":December 2",
                "https://developers.google.com/events/images/gaming-day_480.png"
            )

        )
    }
}